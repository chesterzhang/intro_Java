package indi.chester.spring.ioc;

import indi.chester.spring.ioc.entity.Apple;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {
    public static void main(String[] args) {
        // 如果有多个配置文件,后面的会覆盖掉前面的
        String[] configLocations = new String[]{"classpath:applicationContext.xml","classpath:applicationContext2.xml"};
        //创建 Spring IoC 容器, 并配置文件在容器中实例化对象
        ApplicationContext context = new ClassPathXmlApplicationContext(configLocations);

        //获取 bean
        Apple apple4=context.getBean("apple4",Apple.class);
        System.out.println(apple4.getTitle());
        Apple apple3=(Apple) context.getBean("apple3");
        System.out.println(apple3.getTitle());
        Apple apple2=context.getBean("apple2",Apple.class);
        System.out.println(apple2.getTitle());

        Apple apple5=(Apple)context.getBean("indi.chester.spring.ioc.entity.Apple");
        System.out.println(apple5.getTitle());
    }
}
