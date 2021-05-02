package indi.chester.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * 对Cat类的对象按照其成员属性name进行升序排序, age进行降序排序
 * 通过Collections.sort(List<T> list, Comparator<? super T> c)，？super T 表示: T的子类
 * 这里的T就是Cat
 */

public class CatTest {

	public static void main(String[] args) {

		Cat huahua = new Cat("huahua", 5, "英短");
		Cat fanfan = new Cat("fanfan", 2, "中华田园猫");

		List<Cat> catList = new ArrayList<Cat>();

		catList.add(huahua);
		catList.add(fanfan);

		// 排序前
		System.out.println("按名字排序前:");
		for (Cat cat : catList) {
			System.out.println(cat + " ");
		}
		System.out.println();

		// 按名字排序
		Collections.sort(catList, new NameComparator());

		// 排序后
		System.out.println("按名字排序后:");
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

		// 排序后
		System.out.println("按名字排序后:");
		for (Cat cat : catList) {
			System.out.println(cat + " ");
		}
		System.out.println();

	}

}
