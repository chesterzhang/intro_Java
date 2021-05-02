package indi.chester.animal;

//Cat 继承了 Animal
//不希望Cat被继承, 所以使用final修饰
//新增了一个private属性food
//重写了父类的getName, getMonth方法, 父类中为protected, 重写为public方便调用
//重写了父类的eat方法

public final class Cat extends Animal {
	
	private String food;

	public Cat(String name, int month, String species,String food ) {
		//子类构造默认调用父类的无参构造方法
		//可以通过super()调用父类允许被访问的带参构造
		//super()必须放在第一行
		super(name,month,species);
		this.setFood(food);
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}


	@Override
	public void eat() {
		System.out.println(this.getName() + "喜欢吃"+this.getFood()+"!");
	}
	

	@Override
	public String getName() {
		return super.getName();
	}

	@Override
	public  int getMonth() {
		return super.getMonth();
	}

	 
	
}
