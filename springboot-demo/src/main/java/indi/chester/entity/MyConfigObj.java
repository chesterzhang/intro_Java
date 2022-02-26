package indi.chester.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component //将本配置放到SpringBoot IoC容器中, 使其被扫描到
@ConfigurationProperties(prefix = "user")
@PropertySource(value = "classpath:MyConfigObj.properties",encoding = "utf-8")
public class MyConfigObj {
    private String username;
    private String gender;

// 这里不能用构造方法, 因为对象的setter已经在 MyConfigObj.properties 里面已经完成了
//    public MyConfigObj(String username, String gender) {
//        this.username = username;
//        this.gender = gender;
//    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
