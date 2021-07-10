package indi.chester.map;

//Map 中的数据是以键值对 key-value 的形式存储的,通过key 找到value, key不能重复
//key-value以Entry类型的对象实例存在

import java.util.*;
import java.util.Map.Entry;

public interface MapDemo {

    public static void main(String[] args) {
        // 分别用HashMap, TreeMap实现一个词典
        Map<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new TreeMap<>();

        map1.put("Pig", "猪");
        map1.put("Dog", "狗");
        map1.put("Cat", "猫");
        map1.put("elephant", "象");
        map1.remove("elephant");
        if (map1.containsKey("Pig")){
            System.out.println("Pig 中文意思是 "+ map1.get("Pig"));
        }

        System.out.println("============================");

        // 打印输出Map的key和value,通过entrySet方法
        // entrySet返回值是Set<Entry<key类型, value类型>>
        System.out.println("通过entrySet得到key-value :");
        Set<Entry<String, String>> entrySet = map1.entrySet();
        for (Entry<String, String> entry : entrySet) {
            System.out.print(entry.getKey() + " - ");
            System.out.println(entry.getValue());
        }

        System.out.println("============================");

        // 打印输出Map的key和value,通过keySet方法
        System.out.println("通过keySet得到key-value :");
        // 1.取得KeySet
        Set<String> keySet = map1.keySet();
        // 2.遍历keySet
        for (String key : keySet) {
            System.out.println( key + " - " + map1.get(key));
        }

        System.out.println("============================");


        // 打印输出Map的values, 使用迭代器
        System.out.println("打印输出Map的values, 使用迭代器 ");
        Iterator<String> it = map1.values().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("============================");
        System.out.println("打印输出Map的values, 使用迭代器 ");
        for (String s: map1.values()) {
            System.out.println(s);
        }

    }

}
