package indi.chester.wrap;

/**
 * 包装类 , 装箱与拆箱操作
 * @author Chester_Zhang
 *
 */
public class WrapDemo1 {

	public static void main(String[] args) {
		// 装箱 : 把基本数据类型转换成包装类
		
		// 1. 自动装箱
		int t1 = 2;
		Integer t2 = t1;

		// 2.手动装箱
		Integer t3 = new Integer(t1);

		// 测试
		System.out.println("int 类型变量 t1 : " + t1);
		System.out.println("Integer 类型对象 t2 : " + t2);
		System.out.println("Integer 类型对象 t3 : " + t3);
		System.out.println("====================================");

		// 拆箱:把包装类型转换成基本数据类型
		// 1.自动拆箱
		int t4 = t2;
		// 2.手动拆箱
		int t5 = t2.intValue();
		double t6 = t2.doubleValue();

		// 测试
		System.out.println("int 类型 自动拆箱 t4 : " + t4);
		System.out.println("int 类型 手动拆箱 t5 : " + t5);
		System.out.println("int 类型 手动拆箱成double t6 : " + t6);

	}

}
