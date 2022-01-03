package indi.chester.spring.ioc.bookshop.service;

import indi.chester.spring.ioc.bookshop.dao.BookDao;

public class BookService {

    private BookDao bookDao;
    public void pruchase(){
        System.out.println("正在执行图书馆采购业务方法");
        bookDao.insert();
    }

    public BookDao getBookDao() {
        return bookDao;
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
