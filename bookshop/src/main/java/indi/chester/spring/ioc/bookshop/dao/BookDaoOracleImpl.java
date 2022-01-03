package indi.chester.spring.ioc.bookshop.dao;

public class BookDaoOracleImpl implements BookDao {
    public void insert() {
        System.out.println("向 Oracle Book 表插入一条数据");
    }
}
