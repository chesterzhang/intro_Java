package indi.chester.comparator;

import java.util.Comparator;

/**
 * 通过Comparator接口重写compare方法, 实现对Cat类对象的Age进行降序排序
 * 
 * @author Chester_Zhang
 *
 */

public class AgeComparator implements Comparator<Cat> {

	@Override
	public int compare(Cat o1, Cat o2) {
		// 重写compare方法
		// compare(T arg1, T arg2) 返回负数若arg1<arg2, 返回0相等, 返回正数若arg1>arg2
		int age1 = o1.getMonth();
		int age2 = o2.getMonth();
		
		//因为是降序, 故由参数2-参数1 
		return age2 - age1;
	}

}
