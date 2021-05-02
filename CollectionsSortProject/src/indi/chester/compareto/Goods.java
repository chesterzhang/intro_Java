package indi.chester.compareto;

//Goods类实现Comparable接口,重写compareTO方法实现对成员属性price的降序排序
public class Goods implements Comparable<Goods> {

	private String id;// 商品编号
	private String name;// 商品名称
	private double price;// 商品价格

	public Goods(String id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public int compareTo(Goods g) {
		// 将当前对象与传入对象的成员属性进行比较
		// 返回负数若this.成员 < arg.成员, 返回0若相等, 返回正数若this.成员>arg.成员
		double price1 = this.getPrice();
		double price2 = g.getPrice();
		
		//因为是降序, 故取反
		int n = new Double(price2 - price1).intValue();
		return n;
 
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}
