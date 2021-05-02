package indi.chester.array;

//一维数组, 数组也是引用型变量
public class ArrayDemo2 {

	public static void main(String[] args) {
		//二维数组声明 : 变量名 类型 [][] 变量名=new 类型名[行数][列数]; 行数必须有,列数可以不提供
		//二维数组初始化: 变量名={{元素[0][0], 元素[0][1]...}, {... } }
		
		int[][] intArray;
		float[][] floatArray;

		// 创建一个三行三列的int数组
		intArray = new int[3][3];
		System.out.println("intArray数组第三行第二列元素:" + intArray[2][1]);

		// 为第二行第三个复制为9
		intArray[1][2] = 9;
		System.out.println("intArray数组第二行第三列元素为:" + intArray[1][2]);

		// 声明数组的同时进行创建
		char[][] ch = new char[3][5];

		// 创建float类型的数组时候,只指定行数
		floatArray = new float[3][]; // 必须要指定行数,列数可以省略
		// System.out.println(floatArray[0][0]); //会报错
		// 每一行相当于一个一维数组
		floatArray[0] = new float[3];
		floatArray[1] = new float[4];
		floatArray[2] = new float[5];
		System.out.println(floatArray[0][0]);

		// 二维数组初始化，每一行列数相等
		int[][] num = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println("num数组第1行第2列的元素为:" + num[0][1]);
		System.out.println("num数组的行数为:" + num.length);
		System.out.println("num数组的列数为:" + num[0].length);
		
		//二维数组初始化，每一行列数不相等
		int[][] num1 = { { 78, 98 }, { 65, 75, 63, 63 }, { 98 } };
		System.out.println("num1数组第1行的列数为:" + num1[0].length);

	}

}
