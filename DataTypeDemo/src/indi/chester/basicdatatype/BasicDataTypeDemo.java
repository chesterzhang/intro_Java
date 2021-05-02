package indi.chester.basicdatatype;

//用于演示Java 基本数据类型:
//1. 整型 byte,short, int, long
//2. 浮点形 float double
//3. 字符形 char
//4. 布尔型 boolean

public class BasicDataTypeDemo {

	public static void main(String[] args) {
		byte a= 20;
		short b=20;
		int c=20;
		long d1=20;
		long d2=024;//八进制: 数字0打头
		long d3=0X14L;//十六进制: 0X打头
		float e=20f;
		double f=20d;
		
		char g=20;//对应的ASCII码
		
		boolean h=false;
		
		System.out.println("byte 类型 20 : "+a);
		System.out.println("short  类型 20 : "+b);
		System.out.println("int   类型 20 : "+c);
		System.out.println("long 十进制 类型 20 : "+d1);
		System.out.println("long 八进制 类型 20 : "+d2);
		System.out.println("long 十六进制 类型  20 : "+d3);
		System.out.println("float 类型  20 : "+e);
		System.out.println("double 类型  20 : "+f);
		System.out.println("char   类型 20 : "+g);
		System.out.println("boolean   类型 false: "+h);


	}

}
