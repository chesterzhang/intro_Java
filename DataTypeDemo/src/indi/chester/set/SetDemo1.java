package indi.chester.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

//Set 数据类型,  不允许有重复元素
//Java 中有两种常见的Set
//一种是HashSet, 无序
//另一种是TreeSet, 有序

public class SetDemo1 {

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new TreeSet<>();

        set1.add("blue");
        set1.add("red");
        set1.add("black");
        set1.add("yellow");
        set1.add("white");
        set1.remove("white");

        if (set1.contains("blue")){
            System.out.println("HashSet 含有blue");
        }

        set2.add("blue");
        set2.add("red");
        set2.add("black");
        set2.add("yellow");




        // 用迭代器遍历元素
        System.out.println("HashSet中元素为:");
        Iterator it1 = set1.iterator();
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }

        System.out.println();

        //也可以用增强型for循环遍历
        System.out.println("HashSet中元素为:");
        for (String s: set1) {
            System.out.println(s);
        }

        System.out.println();

        // 用迭代器遍历元素
        System.out.println("TreeSet中元素为:");
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }

        System.out.println();

        //也可以用增强型for循环遍历
        System.out.println("TreeSet中元素为:");
        for (String s: set2) {
            System.out.println(s);
        }


    }


}

