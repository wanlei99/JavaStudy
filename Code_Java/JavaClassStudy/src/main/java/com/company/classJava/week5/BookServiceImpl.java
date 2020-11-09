package com.company.classJava.week5;

/**
 * @ClassName BookServiceImpl
 * @Description TODO
 * @Author WL
 * @Date 2020/11/2
 **/
public class BookServiceImpl implements IBookService {
    @Override
    public boolean putAwayBook(Book book) throws IsNotThirteenNumberException, BookNameException, PriceException {
        String bookName = book.getBookName();
        if (!book.getISBN().matches("/^\\d{3}-\\d-\\d{3}-\\d{5}-\\d$/")) {
            throw new IsNotThirteenNumberException(bookName +  ":ISBN必须为十三位数字！");
        } if (bookName.contains("暴力") || bookName.contains("恐怖")) {
            throw  new BookNameException(bookName + ":书名包含禁词！");
        } if (book.getBookPrice() > 100) {
            throw new PriceException(bookName + "：价格不合理！");
        }
        else {
           return true;
        }
    }
}
