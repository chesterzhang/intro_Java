package indi.chester.spring.ioc;

import indi.chester.spring.ioc.entity.Company;
import indi.chester.spring.ioc.entity.Computer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {
    public static void main(String[] args) {
        //创建 Spring IoC 容器, 并配置文件在容器中实例化对象
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Company company = context.getBean("company", Company.class);
        System.out.println(company);
        String address=company.getInfo().getProperty("address");
        System.out.println(address);

        System.out.println("==============================");
        //查看容器内对象
        String[] beanNames = context.getBeanDefinitionNames();
        for (String beanName: beanNames){
            System.out.println(beanName);
            System.out.println("类型:"+context.getBean(beanName).getClass().getName());
        }

        System.out.println("==============================");
        //获取 匿名 bean, 实际工作中不推荐使用
        Computer hp = context.getBean("indi.chester.spring.ioc.entity.Computer#0", Computer.class);
        System.out.println(hp.getBrand());
        Computer asus = context.getBean("indi.chester.spring.ioc.entity.Computer#1", Computer.class);
        System.out.println(asus.getBrand());

    }
}
