package indi.chester.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Set 数据类型, 与数学中的集合类似,不允许有重复元素, 元素之间无序
 * @author Chester_Zhang
 */

//Set本质上是一个类
//add, iterator方法;

public class SetDemo1 {

	public static void main(String[] args) {
		// 将英文单词添加到HashSet中
				Set set = new HashSet();

				set.add("blue");
				set.add("red");
				set.add("black");
				set.add("yellow");
				set.add("white");

				
				// 用迭代器遍历输出元素
				System.out.println("集合中元素为:");
				Iterator it = set.iterator();
				while (it.hasNext()) {
					System.out.println(it.next());
				}

				// 在集合中插入新元素
				set.add("green");
				set.add("white");//重复元素
				// 用迭代器遍历输出元素
				it = set.iterator();
				System.out.println("集合中元素为:");
				while (it.hasNext()) {
					System.out.println(it.next());
				}


	}

}
