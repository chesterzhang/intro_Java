package indi.chester.singletonmodel;

public class Test {

	public static void main(String[] args) {
		// 私有化构造函数无法访问
		// SingletonOne one=new SingletonOne();

		// 只能通过共有的静态方法直接获取一个静态实例
		//饿汉式
		SingletonOne one = SingletonOne.getInstance();
		SingletonOne two = SingletonOne.getInstance();
		System.out.println(one);
		System.out.println(two);//因为是单例模式, 所以地址相同

		System.out.println("\n=============================================\n");
		//懒汉式
		SingletonTwo one1 = SingletonTwo.getInstance();
		SingletonTwo two1 = SingletonTwo.getInstance();
		System.out.println(one1);
		System.out.println(two1);//因为是单例模式, 所以地址相同

	}

}
