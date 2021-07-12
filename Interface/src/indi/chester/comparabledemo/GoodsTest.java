package indi.chester.comparabledemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class GoodsTest {
    public static void main(String[] args) {

        Goods g1 =new Goods("手机",2000);
        Goods g2 =new Goods("自行车",1000);
        Goods g3 =new Goods("电脑",5000);

        if (g1.compareTo(g2)<0){
            System.out.println("手机比电脑贵");
        }

        List<Goods> goodsList= new ArrayList<>();
        goodsList.add(g1);
        goodsList.add(g2);
        goodsList.add(g3);

        // 对商品价格进行降序排序前
        System.out.println("对商品价格进行降序排序前 : ");
        for (Goods goods : goodsList) {
            System.out.println(goods);
        }

        System.out.println();

        // 对商品价格进行降序排序
        Collections.sort(goodsList);

        // 对商品价格进行降序排序后
        System.out.println("对商品价格进行降序排序后 : ");
        for (Goods goods : goodsList) {
            System.out.println(goods);
        }

    }

}
