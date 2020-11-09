package com.company.classJava.week5;

/**
 * @ClassName IBookService
 * @Description 接口
 * @Author WL
 * @Date 2020/11/2
 **/
public interface IBookService {
     /**
      * 书本上架
      * @param book
      * @return 是否上架
      * @throws IsNotThirteenNumberException ISBN 是否为十三位数字
      */
     boolean putAwayBook(Book book) throws IsNotThirteenNumberException, BookNameException, PriceException;
}
