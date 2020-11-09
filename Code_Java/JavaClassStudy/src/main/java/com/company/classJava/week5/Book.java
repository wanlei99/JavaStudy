package com.company.classJava.week5;

import lombok.*;

/**
 * @ClassName Book
 * @Description TODO
 * @Author WL
 * @Date 2020/11/2
 **/
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Book {
    private String ISBN;
    private String bookName;
    private Integer bookPrice;

    //public static Object bulider() {
    //}
}
