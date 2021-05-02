package indi.chester.singletonmodel;

//懒汉式:创建类的时候让实例指向null, 直到第一次调用get方法时才完成实例化操作
//时间换空间
public class SingletonTwo {
	// 1.创建私有构造
	private SingletonTwo() {

	}

	// 2.创建该类型的私有静态实例
	private static SingletonTwo instance = null;

	// 3. 创建共有静态方法返回静态实例对象
	public static SingletonTwo getInstance() {
		if (instance == null) {
			instance = new SingletonTwo();
		}
		return instance;
	}
}
