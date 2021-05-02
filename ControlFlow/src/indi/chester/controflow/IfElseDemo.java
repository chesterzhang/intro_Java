package indi.chester.controflow;

import java.util.Scanner;
/**
 * If else 语句
 * @author Chester_Zhang
 */
public class IfElseDemo {

	public static void main(String[] args) {
		System.out.println("请输入1-7 :");
		
		Scanner sc= new Scanner(System.in);
		int weekDay=sc.nextInt();
		
		if (weekDay == 1) {
			System.out.println("周一");
		}else if(weekDay == 2) {
			System.out.println("周二");
		}else if(weekDay == 3) {
			System.out.println("周三");
		}else if(weekDay == 4) {
			System.out.println("周四");
		}else if(weekDay == 5) {
			System.out.println("周五");
		}else if(weekDay == 6) {
			System.out.println("周六");
		}else if(weekDay == 7) {
			System.out.println("周日");
		}else {
			System.out.println("一周只有7天, 请输入1-7！");
		}


			
	}

}
