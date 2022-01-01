package indi.chester.spring.ioc;

import indi.chester.spring.ioc.entity.Apple;
import indi.chester.spring.ioc.entity.Child;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {
    public static void main(String[] args) {
        //创建 Spring IoC 容器, 并配置文件在容器中实例化对象
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        //获取 bean
        Apple sweetApple=context.getBean("sweetApple", Apple.class);
        System.out.println(sweetApple.getTitle());

        Child tom=context.getBean("tom", Child.class);
        tom.eat();
    }
}
