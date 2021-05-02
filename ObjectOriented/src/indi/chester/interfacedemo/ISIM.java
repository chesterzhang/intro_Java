package indi.chester.interfacedemo;

//SIM卡上网接口
//接口: 可以认为是一个标准, 实现这个接口的类必须遵守标准
//接口方法 默认是public, abstract的, 就是开放给实现它的类去重写
//接口方法可以被default, static去修饰,修饰完了不需要重写
//		被default修饰,强调的是给这个方法一个默认功能, 实现这个接口的类可以不用一一去重写
//		被static修饰强调的是这个方法是这这个接口的一个固有属性,也就无需被实现接口的类去重写
//接口变量默认 public, final, 就是开放出来的标准,既然是标准就不能改就应该用final修饰
public interface ISIM extends INet {
	
	 default void connect() {
		 System.out.println("使用SIM卡上网");
	 }
	
}
