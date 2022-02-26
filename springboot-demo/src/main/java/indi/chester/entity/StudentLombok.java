package indi.chester.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data //Data 注解可以免写 getter 和 setter
@ToString //ToString 注解可以免写 toString 方法
@NoArgsConstructor //生成默认构造方法
@AllArgsConstructor //生成全参构造方法
public class StudentLombok {
    private String name;
    private Integer age;
}
