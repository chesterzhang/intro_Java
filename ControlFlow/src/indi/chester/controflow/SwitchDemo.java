package indi.chester.controflow;

import java.util.Scanner;

//switch 语句
public class SwitchDemo {

	public static void main(String[] args) {
		System.out.println("请输入1-7 :");
		Scanner sc = new Scanner(System.in);
		int weekDay = sc.nextInt();

		switch (weekDay) {
		case 1:
			System.out.println("星期1");
			break;
		case 2:
			System.out.println("星期2");
			break;
		case 3:
			System.out.println("星期3");
			break;
		case 4:
			System.out.println("星期4");
			break;
		case 5:
			System.out.println("星期5");
			break;
		case 6:
			System.out.println("星期6");
			break;
		case 7:
			System.out.println("星期7");
			break;
		default:
			System.out.println("一周只有7天, 请输入1-7！");

		}

	}

}
