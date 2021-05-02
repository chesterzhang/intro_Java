package indi.chester.interfacedemo;

//一个场景彻底搞懂什么是接口
//搞懂接口中的变量,方法为什么默认/需要用default, final,static 修饰
//搞懂接口的继承, 一个类实现多个接口
public class LaptopTest {

	public static void main(String[] args) {
		
		Laptop lp1= new Laptop();
		lp1.connect();
		lp1.chargerType();
		System.out.println("充电器最大充电电压 : "+ICharger.maxVoltage );
 
	}
	
}
