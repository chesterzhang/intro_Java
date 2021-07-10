package indi.chester.stringbuilder;

//StringBuilder 具有可变性质
//若频繁操作字符串, 建议使用StringBuilder
//常用append, delete, insert, replace, substring方法

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder str1=new StringBuilder("你好");
        System.out.println("StringBuilder str1 hashcode"+str1.hashCode());
        str1.append(',');
        str1.append("Java!");
        System.out.println("StringBuilder str1 hashcode"+str1.hashCode());//完全一样
        System.out.println("str="+str1);


        //将字符串变成”你好,C++!“
        //两种方式
        //1. 使用delete方法删除mooc, 再插入MOOC
        //2.使用replace方法直接替换
        System.out.println("替换后:"+str1.delete(3,8).insert(3, "C++!"));
        System.out.println("替换后:"+str1.replace(3, 8, "C++!"));

        //在字符串中取出"你好"并输出
        System.out.println("取出 \"你好\" : "+str1.substring(0,2));

    }
}
