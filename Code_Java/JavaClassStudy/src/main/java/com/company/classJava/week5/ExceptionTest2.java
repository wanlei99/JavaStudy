package com.company.classJava.week5;

import java.io.*;

/**
 * @ClassName ExceptionTest2
 * @Description 编译时异常
 * @Author WL
 * @Date 2020/11/2
 **/
public class ExceptionTest2 {
    public static void main(String[] args) {
        //File file = new File("E:\\test.txt");
        //try {
        //    InputStream is = new FileInputStream(file);
        //} catch (FileNotFoundException e) {
        //    e.printStackTrace();
        //}
        try {
            byte[] b = readFile("E:\\test1.txt");
            System.out.println(b.length);
        } catch (IOException e) {
            System.err.println("出现IO异常！！！");
        } finally {
            //常常用于数据库连接的关闭，线程池资源的回收，IO设备的关闭
            System.out.println("无论有无异常都会执行的代码段！");
        }
        System.out.println("其他代码！");

    }
    public static byte[] readFile(String path) throws IOException {
        File file = new File(path);
        byte[] b = new byte[(int)file.length()];
        InputStream is = new FileInputStream(file);
        int result = is.read(b);
        System.out.println(result);
        is.close();
        return b;

    }
}
