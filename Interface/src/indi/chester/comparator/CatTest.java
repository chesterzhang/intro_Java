package indi.chester.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CatTest {
    public static void main(String[] args) {

        Cat huahua = new Cat("huahua", 5 );
        Cat fanfan = new Cat("fanfan", 2 );

        List<Cat> catList = new ArrayList<Cat>();

        catList.add(huahua);
        catList.add(fanfan);

        // 排序前
        System.out.println("按名字排序前:");
        for (Cat cat : catList) {
            System.out.println(cat + " ");
        }
        System.out.println();

        // 按名字升序排序
        Collections.sort(catList, new NameComparator());

        // 按名字升序排序后
        System.out.println("按名字升序排序后:");
        for (Cat cat : catList) {
            System.out.println(cat + " ");
        }
        System.out.println();

        // 按年龄降序排序
        System.out.println("按年龄排序前:");
        for (Cat cat : catList) {
            System.out.println(cat + " ");
        }
        System.out.println();

        // 按年龄降序排序
        Collections.sort(catList, new AgeComparator());

        // 按年龄降序排序后
        System.out.println("按年龄降序排序后:");
        for (Cat cat : catList) {
            System.out.println(cat + " ");
        }
        System.out.println();

    }
}
