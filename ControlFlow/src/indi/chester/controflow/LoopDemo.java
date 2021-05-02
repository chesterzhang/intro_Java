package indi.chester.controflow;

/**
 * 循环语句, for 循环, While 循环, do-while 循环
 * @author Chester_Zhang
 */


// break, continue 语句在java语句中依然存在,这里不赘述
public class LoopDemo {

	public static void main(String[] args) {
		//用 for 循环求1到10累加
		int sum=0;
		for(int i=1; i<=10;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		
		//用 while 循环求1到10累加
		int i=1;
		sum=0;
		while(i<=10) {
			sum=sum+i;
			i=i+1;
		}
		System.out.println(sum);
		
		//用 do-while 循环求1到10累加
		i=1;
		sum=0;
		do {
			sum=sum+i;
			i=i+1;
		}while(i<=10);
		System.out.println(sum);
		

	}

}
