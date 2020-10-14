# Java中创建对象的5种方式

| 方法                               | 方式                 |
| ---------------------------------- | -------------------- |
| 使用new关键字                      | } → 调用了构造函数   |
| 使用Class类的newInstance方法       | } → 调用了构造函数   |
| 使用Constructor类的newInstance方法 | } → 调用了构造函数   |
| 使用clone方法                      | } → 没有调用构造函数 |
| 使用反序列化                       | } → 没有调用构造函数 |

## 1.使用new关键字

* 这是最常见也是最简单的创建对象的方式了。通过这种方式，我们可以调用任意的构造函数(无参的和带参数的)。

  ```java
  Employee emp1 = new Employee();
  0: new           #19          // class org/programming/mitra/exercises/Employee
  3: dup
  4: invokespecial #21          // Method org/programming/mitra/exercises/Employee."":()V
  ```

## 2.使用Class类的newInstance方法

* 我们也可以使用Class类的newInstance方法创建对象。这个newInstance方法调用无参的构造函数创建对象。

  我们可以通过下面方式调用newInstance方法创建对象

```java
Employee emp2 = (Employee) Class.forName("org.programming.mitra.exercises.Employee").newInstance();
或者

Employee emp2 = Employee.class.newInstance();
51: invokevirtual    #70    // Method java/lang/Class.newInstance:()Ljava/lang/Object;
```

## 3.使用Constructor类的newInstance方法

* 和Class类的newInstance方法很像， java.lang.reflect.Constructor类里也有一个newInstance方法可以创建对象。我们可以通过这个newInstance方法调用有参数的和私有的构造函数。

  ```java
  Constructor<Employee> constructor = Employee.class.getConstructor();
  Employee emp3 = constructor.newInstance();
  111: invokevirtual  #80  // Method java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
  ```

## 4.使用clone方法

* 无论何时我们调用一个对象的clone方法，jvm就会创建一个新的对象，将前面对象的内容全部拷贝进去。用clone方法创建对象并不会调用任何构造函数。

  要使用clone方法，我们需要先实现Cloneable接口并实现其定义的clone方法。

  ```java
  Employee emp4 = (Employee) emp3.clone();
  162: invokevirtual #87  // Method org/programming/mitra/exercises/Employee.clone ()Ljava/lang/Object;
  ```

## 5.是要用反序列化

* 当我们序列化和反序列化一个对象，jvm会给我们创建一个单独的对象。在反序列化时，jvm创建对象并不会调用任何构造函数。
  为了反序列化一个对象，我们需要让我们的类实现Serializable接口

  ```java
  ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.obj"));
  Employee emp5 = (Employee) in.readObject();
  261: invokevirtual  #118   // Method java/io/ObjectInputStream.readObject:()Ljava/lang/Object;
  ```

## 例子

让我们看一看为下面这个Employee类创建对象：

```java
class Employee implements Cloneable, Serializable {
    private static final long serialVersionUID = 1L;
    private String name;
    public Employee() {
        System.out.println("Employee Constructor Called...");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Employee [name=" + name + "]";
    }
    @Override
    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
```

下面的Java程序中，我们将用5种方式创建Employee对象。

```java
public class ObjectCreation {
    public static void main(String... args) throws Exception {
        // By using new keyword
        Employee emp1 = new Employee();
        emp1.setName("Naresh");
        System.out.println(emp1 + ", hashcode : " + emp1.hashCode());
        // By using Class class's newInstance() method
        Employee emp2 = (Employee) Class.forName("org.programming.mitra.exercises.Employee")
                               .newInstance();
        // Or we can simply do this
        // Employee emp2 = Employee.class.newInstance();
        emp2.setName("Rishi");
        System.out.println(emp2 + ", hashcode : " + emp2.hashCode());
        // By using Constructor class's newInstance() method
        Constructor<Employee> constructor = Employee.class.getConstructor();
        Employee emp3 = constructor.newInstance();
        emp3.setName("Yogesh");
        System.out.println(emp3 + ", hashcode : " + emp3.hashCode());
        // By using clone() method
        Employee emp4 = (Employee) emp3.clone();
        emp4.setName("Atul");
        System.out.println(emp4 + ", hashcode : " + emp4.hashCode());
        // By using Deserialization
        // Serialization
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("data.obj"));
        out.writeObject(emp4);
        out.close();
        //Deserialization
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("data.obj"));
        Employee emp5 = (Employee) in.readObject();
        in.close();
        emp5.setName("Akash");
        System.out.println(emp5 + ", hashcode : " + emp5.hashCode());
    }
}
```

程序会输出：

```java
Employee Constructor Called...
Employee [name=Naresh], hashcode : -1968815046
Employee Constructor Called...
Employee [name=Rishi], hashcode : 78970652
Employee Constructor Called...
Employee [name=Yogesh], hashcode : -1641292792
Employee [name=Atul], hashcode : 2051657
Employee [name=Akash], hashcode : 63313419
```