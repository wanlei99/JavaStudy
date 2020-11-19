package com.company.classJava.week11;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @ClassName Student
 * @Description Student类
 * @Author WL
 * @Date 2020/11/16
 **/
@NoArgsConstructor
@AllArgsConstructor
@Data@Builder
public class Student implements Comparable<Student>, Serializable {
    private static final long serialVersionUID = 3438217359393883399L;
    private String name;
    private Integer age;

    @Override
    public int compareTo(Student o) {
        if (this.age > o.age) {
            return 1;
        } else if (this.age < o.age) {
            return -1;
        } else {
            return 0;
        }

    }
}
