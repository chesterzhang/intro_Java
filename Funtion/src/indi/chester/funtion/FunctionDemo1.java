package indi.chester.funtion;

/**
 * Java方法介绍, 方法定义，方法重载，方法带可变参数列表
 * @author Chester_Zhang
 */

public class FunctionDemo1 {
	
	//方法定义: 访问限制符 返回类型 方法名(参数1, 参数2, ...）
	 
	public  int plus(int a, int b) {
		return a+b;
	}
	
	//方法重载: 除了参数必须不同,其他可以相同,其意义在于: 让一个方法在同一个类里面有不同的作用
	public  float plus(float a, float b) {
		return a+b;
	}
	
	//可变参数列表作为参数
	//当可边参数和不可变参数重名
	public void  search(int n, int... a) {
		boolean flag=false;
		for(int a1:a) {
			if (a1==n) {
				flag=true;
				break;
			}
		}
		if (flag) {
			System.out.println("找到了 "+n);
		}else {
			System.out.println("没找到 "+n);
		}
	}
	
	
	public static void main(String[] args) {
		
		int a=1, b=2;
		FunctionDemo1 fd=new FunctionDemo1();
		System.out.println("1+2 = "+fd.plus(a,b));
		
		float c=1.0f, d=2.0f;
		System.out.println("1.0+2.0 = "+fd.plus(a,b));
		
		int[] arr={5,4,3,2,1,0};
		fd.search(1, arr);
		fd.search(1, 5,4,3,2,1,0);
	}
}
