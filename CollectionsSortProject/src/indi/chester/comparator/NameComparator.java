package indi.chester.comparator;

/**
 * 通过Comparator接口重写compare方法, 实现对Cat类对象的Name进行升序排序
 * @author Chester_Zhang
 *
 */

import java.util.Comparator;

public class NameComparator implements Comparator<Cat>{
	
	@Override
	public int compare(Cat o1, Cat o2) {
		//重写compare方法
		//compare(T arg1, T arg2) 返回负数若arg1<arg2, 返回0相等, 返回正数若arg1>arg2
		String name1=o1.getName();
		String name2=o2.getName();
		
		//调用字符串compareTo 方法完成字符串的相减
		int n=name1.compareTo(name2);
		
		return n;
	}
}
