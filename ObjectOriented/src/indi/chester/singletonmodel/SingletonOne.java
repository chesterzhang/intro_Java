package indi.chester.singletonmodel;

//饿汉式: 创建类的时候直接实例化, 以空间换时间
public class SingletonOne {
	// 1.创建私有构造
	private SingletonOne() {

	}

	// 2.创建该类型的私有静态实例
	private static SingletonOne instance = new SingletonOne();

	// 3. 创建共有静态方法返回静态实例对象
	public static SingletonOne getInstance() {
		return instance;
	}

}
