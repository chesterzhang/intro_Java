package indi.chester.string;

import java.io.UnsupportedEncodingException;

public class StringDemo1 {

    public static void main(String[] args) throws UnsupportedEncodingException {

        // 定义一个字符串"Java 编程 基础"
        String str = new String("Java 编程 基础");
        //String str = "Java 编程 基础"; //和上面一句等价

        // length 打印输出字符串的长度
        System.out.println("字符串的长度是 : " + str.length());

        // substring 去除字串"编程 基础"并输出
        System.out.println(str.substring(5));
        System.out.println(str.substring(5, 10));

        // substring 取出字符 "程" 并输出
        System.out.println(str.charAt(6));

        // index 查找'a'字符串中第一次出现的位置
        System.out.println("字符'a'在字符串中第一次出现的位置 : " + str.indexOf('a'));

        // lastIndexOf 查找'a'字符串中最后一次出现的位置
        System.out.println("字符'a'在字符串中第一次出现的位置 : " + str.lastIndexOf('a'));

        // 从位置3开始，查找'a'字符串中第一次出现的位置
        System.out.println("从位置8开始，字符'a'在字符串中第一次出现的位置 : " + str.indexOf('a', 3));

        System.out.println("=============================");

        // 将字符串转换为byte数组,并打印输出
        byte[] arrs=null;
        try {
            arrs = str.getBytes("GBK");// 也可以不指定编码格式,win默认GBK，mac默认UTF-8
            for (int i = 0; i < arrs.length; i++) {
                System.out.print(arrs[i]+" ");
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("=============================");

        //将byte数组转换为字符串
        String str1=new String(arrs,"GBK");//也可以不指定编码格式,win默认GBK
        System.out.println(str1);

    }

}


