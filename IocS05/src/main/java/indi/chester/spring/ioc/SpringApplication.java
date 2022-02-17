package indi.chester.spring.ioc;

import indi.chester.spring.ioc.dao.UserDao;
import indi.chester.spring.ioc.entity.Order;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {
    public static void main(String[] args) {
        //创建 Spring IoC 容器, 并配置文件在容器中实例化对象
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        UserDao userDao1 = context.getBean("userDao", UserDao.class);
        UserDao userDao2 = context.getBean("userDao", UserDao.class);
        UserDao userDao3 = context.getBean("userDao", UserDao.class);



    }
}
