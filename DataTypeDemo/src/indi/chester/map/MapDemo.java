package indi.chester.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/**
 * Map
 * 
 * @author Chester_Zhang
 *
 */

//Map 中的数据是以键值对 key-value 的形式存储的， 通过key 找到value, key不能重复
//key-value以Entry类型的对象实例存在

public class MapDemo {

	public static void main(String[] args) {
		// 实现一个词典
		Map<String, String> animal = new HashMap<String, String>();

		animal.put("Cat", "猫");
		animal.put("Dog", "狗");

		System.out.println("============================");

		// 打印输出Map的values, 使用迭代器
		System.out.println("打印输出Map的values, 使用迭代器 ");
		Iterator<String> it = animal.values().iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("============================");

		// 打印输出Map的key和value,通过entrySet方法
		// entrySet返回值是Set<Entry<key类型, value类型>>
		System.out.println("通过entrySet得到key-value :");
		Set<Entry<String, String>> entrySet = animal.entrySet();
		for (Entry<String, String> entry : entrySet) {
			System.out.print(entry.getKey() + " - ");
			System.out.println(entry.getValue());
		}

		System.out.println("============================");

		// 打印输出Map的key和value,通过entrySet方法
		String strSearch = "Cat";
		// 1.取得KeySet
		Set<String> keySet = animal.keySet();
		// 2.遍历keySet
		for (String key : keySet) {
			if (strSearch.equals(key)) {
				System.out.println("找到了,键值对为 : " + key + " - " + animal.get(key));
				break;
			}
		}

	}

}
