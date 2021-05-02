package indi.chester.animal;

public class CatTest {

	public static void main(String[] args) {
		
		Animal.sleep();
		
		Cat cat1= new Cat("鸡腿",3, "金渐层","小鱼干");
		Cat cat2= new Cat("泰哥",4, "美短","鸡肉罐头");
		
		cat1.eat();
		cat2.eat();
		
		System.out.println(cat1);
		System.out.println(cat2);
		
		System.out.println("cat1 和 cat2 是同一个动物吗? "+ cat1.equals(cat2));
		System.out.println("cat1 和 字符串 \"cat1\" 是同一个动物吗? "+ cat1.equals("cat1"));
		
		System.out.println("cat1 是 Animal的实例化吗 ? "+ (cat1 instanceof  Animal)); 
		
		//虚类不能实例化, 只能通过子类间接向上转型
		Animal tempCat = (Animal) cat1;
		//Animal a1= new Animal("旺财",10,"金毛"); //虚类实例化直接报错
 
	 
	}

}
