package indi.chester.string;

// String 对象的equals 和 == 符号区别
public class StringDemo2 {

	public static void main(String[] args) {
		String str1="java se";//str1是栈空间d额一个引用，指向常量池中的"java se"
		String str2="java se";//str2是栈空间d额一个引用，也指向常量池中的"java se"
		String str3=new String("java se");//str3是栈空间d额一个引用, 指向堆空间的new出来的对象
		
		// 	String 类对其父类的 equals方法进行了重写，比较的是字符串的值
		System.out.println("str1 和 str2 内容 相同吗? : "+(str1.equals(str2)));//true
		System.out.println("str1 和 str3 内容 相同吗? : "+(str1.equals(str3)));//true
		
		System.out.println("str1 和 str2 地址 相同吗? : "+(str1==str2));//true
		System.out.println("str1 和 str3 地址 相同吗? : "+(str1==str3));//false

	}

}
