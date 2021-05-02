package indi.chester.animal;

//一个例子说清 面向对象 封装，继承，多态

//private用法: 1.将所有成员变量设置为private, 所有成员变量必须通过方法来调用
//					   2.将不希望对外展示的方法也用private 修饰
//protected 用法:1. 父类方法设置为protected, 子类重写它，设置为public，以供对象调用
// 				   用法: 2. 父类方法设置为protected,  子类方法里面调用它
//public 用法:   对象希望对外展示的方法全部用public修饰
//abstract 用法: 1.修饰类，表示一个抽象类, 不能被实例化, 其目的就是让子类去继承 

//这里实现了一个抽象类Animal, 不希望它被实例化,只希望它被继承
//故用abstract 修饰Aanimal
//故将setter 和 getter 方法设置为protected, 不希望通过类直接调用,而希望通过其子类的对象来调用

//所有动物都会睡觉觉,故 Animal.sleep方法用static修饰
//所有动物都会吃东西,但是不同的动物吃的不一样,故Animal.eat方法用protected修饰
//希望子类重写Animal.eat方法, 故用abstract修饰
public abstract class Animal {

	private String name;
	private int month;
	private String species;

	protected Animal(String name, int month,String species) {
		this.setName(name);
		this.setMonth(month);
		this.setSpecies(species);
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected int getMonth() {
		return month;
	}

	protected void setMonth(int month) {
		this.month = month;
	}

	protected String getSpecies() {
		return species;
	}

	protected void setSpecies(String species) {
		this.species = species;
	}

	// 睡觉觉方法
	public static void sleep() {
		System.out.println("动物都会睡觉觉!");
	}

	protected abstract void eat() ;

	// 重写Object类的equals方法,用来判断"两个"动物是否是一个动物
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		try {
			Animal temp = (Animal) obj;// 要保证obj 可以转换为Animal 类型
			if (this.getName() == (temp.getName()) && this.getMonth() == temp.getMonth()
					&& this.getSpecies() == temp.getSpecies()) {
				return true;
			} else {
				return false;
			}
		} catch (java.lang.ClassCastException e) {
			e.printStackTrace();
			return false;
		}

	}

	// 重载Animal类的equals方法
	public boolean equals(Animal obj) {
	 
		if (this.getName() == (obj.getName()) && this.getMonth() == obj.getMonth()
				&& this.getSpecies() == obj.getSpecies()) {
			return true;
		} else {
			return false;
		}

	}

	// 重写toString方法
	@Override
	public String toString() {
		return "昵称 : " + this.getName() + " , 品种 : "+this.getSpecies()+" , 年龄 : " + this.getMonth() + "个月";
	}

}
