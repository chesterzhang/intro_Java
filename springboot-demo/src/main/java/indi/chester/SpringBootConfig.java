package indi.chester;

import indi.chester.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //当前类为配置类, 会被容器扫描到
public class SpringBootConfig {
    @Bean //Bean 标签相当于往 IoC 容器中添加 Bean
    public Student stu1(){
        return new Student("John", 20);
    }

    @Bean
    public Student stu2(){
        return new Student("Tom", 10);
    }

}
