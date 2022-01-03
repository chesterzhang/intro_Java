package indi.chester.spring.ioc.bookshop.dao;

public class BookDaoImpl implements BookDao {
    public void insert() {
        System.out.println("向 MySQL Book 表插入一条数据 ");
    }
}
