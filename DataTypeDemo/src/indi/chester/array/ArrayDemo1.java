package indi.chester.array;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //声明形式: 类型[] 变量名 = new 类型[长度]
        //初始化形式: 变量名={元素1, 元素2, ......, 元素n}

        // 声明并创建一个整形数组
        int[] intArray = new int[5];// 默认初始值为0

        // 声明并创建一个字符串数组
        String[] strArray = new String[10];// 默认初始值为null
        // 声明并创建一个float串数组
        float[] floatArray = new float[5];// 默认初始值为0

        // 初始化字符数组
        char[] ch = { 'a', 'b', 'c', 'd' };

        //使用索引遍历数组
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]+" ");
        }
        System.out.println();

        //增强型for循环输出数组ch
        for (char c:ch) {
            System.out.print(c+" ");
        }
        System.out.println();

        System.out.println("ch数组长度为:" + ch.length);
        System.out.println("intArray数组的第2个元素为:" + intArray[1]);
        System.out.println("strArray数组的第5个元素为:" + strArray[4]);
        System.out.println("floatArray数组的最后1个元素为:" + floatArray[floatArray.length - 1]);

    }

}
