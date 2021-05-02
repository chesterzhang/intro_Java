package indi.chester.generic;

import java.util.ArrayList;
import java.util.List;

public class GoodsTest {
	
	public static void main(String[] args) {
		
		// 定义存储book相关的List
		List<Book> books=new ArrayList<Book>();
		books.add(new Book());
		books.add(new Book());

		//调用GoodsSeller 对象完成对商品列表books 的销售
		GoodsSeller gs1= new GoodsSeller();
 
		gs1.sellGoods(books);
	 

	}

}
