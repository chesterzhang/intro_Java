package indi.chester.wrap;

public class WrapDemo2 {

	public static void main(String[] args) {
		// 基本数据类型转换成字符串
		int t1 = 2;
		String t2 = Integer.toString(t1);

		// 测试
		System.out.println("int 类型转换成String 类型对象 t2 =" + t2);

		System.out.println("=================================");
		// 字符串类型转换成基本数据类型, 先将字符串转换为包装类, 再通过自动拆箱
		// 1. 包装类的parse
		// 2. 包装类的valueOf, 
		int t3 = Integer.parseInt(t2);
		int t4 = Integer.valueOf(t2);
		System.out.println("String 类型转换成int 类型 t3 =" + t3);
		System.out.println("String 类型转换成int 类型 t4 =" + t4);

	}

}
