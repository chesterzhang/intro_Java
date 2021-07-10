package indi.chester.arraylist;

//ArrayList 数据类型, 是一个类
//底层由数组实现
//可以动态增长
//在列表尾部插入或删除数据非常有效
//更适合查找和更新元素
//常用方法 add, get, remove size

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo1 {

    public static void main(String[] args) {
        // 用ArrayList存储编程语言的名称,并输出
        List<String> list=new ArrayList<>();
        list.add("Java");
        list.add("C");
        list.add("C++");
        list.add("Go");
        list.add("Swift");

        //输出列表中元素个数
        System.out.println("列表中元素个数为 : "+list.size());

        System.out.println("==============================");

        //使用索引遍历set元素
        for(int i=0;i<list.size();i++) {
            System.out.print(list.get(i)+ " ");
        }

        System.out.println();

        //使用增强型for循环遍历set元素
        for (String s: list) {
            System.out.print(s+" ");
        }

        System.out.println();
        System.out.println("==============================");

        //对list进行排序
        Collections.sort(list);
        System.out.println("list排序后:");
        for(int i=0;i<list.size();i++) {
            System.out.print(list.get(i)+ " ");
        }

        System.out.println();
        System.out.println("==============================");


        //移除列表中的C++
        System.out.println();
        //list.remove(2);
        list.remove("C++");
        System.out.println("==============================");
        System.out.println("移除列表中C++以后的元素为:");
        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i)+ " ");
        }



    }
}
