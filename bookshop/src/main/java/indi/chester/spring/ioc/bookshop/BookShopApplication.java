package indi.chester.spring.ioc.bookshop;

import indi.chester.spring.ioc.bookshop.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookShopApplication {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:applicationContext-*.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.pruchase();
    }
}
