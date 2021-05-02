package indi.chester.string;

//String 对象的不可变性
public class StringDemo3 {

	public static void main(String[] args) {
		String s1="java";//s1指向常量池里面java"
		s1="hello,"+s1;//s1指向常量池里面的"hello,java"
		System.out.println("s1="+s1);
		
		//String 对象一旦被 new 出来，即不可变
		//若给字符串重新赋值，则相当与new了一个新对象

		//用对象==测试
		System.out.println("s1 地址"+s1==(s1="python"));
		
		//用对象hashcode测试,关于hashcode方法详见java文档
		System.out.println(s1.hashCode());
		s1="C++";
		System.out.println(s1.hashCode());
	 
	}

}
