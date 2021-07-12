package indi.chester.comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Cat> {

    // 重写compare方法
    // compare(E arg1, E arg2) 返回负数若arg1<arg2, 返回0相等, 返回正数若arg1>arg2
    @Override
    public int compare(Cat o1, Cat o2) {
        int age1 = o1.getMonth();
        int age2 = o2.getMonth();

        //因为是降序, 故由参数2-参数1
        return age2 - age1;
    }

}