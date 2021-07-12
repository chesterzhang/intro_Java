package indi.chester.comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Cat> {

    // 重写compare方法
    // compare(T arg1, T arg2) 返回负数若arg1<arg2, 返回0相等, 返回正数若arg1>arg2
    @Override
    public int compare(Cat o1, Cat o2) {

        String name1=o1.getName();
        String name2=o2.getName();

        //调用字符串compareTo 方法完成字符串的相减
        int n=name1.compareTo(name2);

        return n;
    }
}
