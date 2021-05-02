package indi.chester.interfacedemo;

public class Laptop implements IWifi, ISIM, ICharger {
	
 
	//对于接口中非default,非static, 或者有多个default重名的方法必须重写
	@Override
	public void connect() {
		System.out.print("笔记本");
		ISIM.super.connect();
		System.out.print("笔记本");
		IWifi.super.connect();
		
	}

	@Override
	public void chargerType() {
		System.out.println("笔记本使用两孔充电器");
	}
	
}
