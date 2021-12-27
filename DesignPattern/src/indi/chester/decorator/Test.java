package indi.chester.decorator;

public class Test {

    public static void main(String[] args) {
        //点一份炒饭
        FastFood food = new FriedRice();
        //花费的价格
        System.out.print(food+" ");
        System.out.println(food.getPrice()+ " 元");


        //点一份加鸡蛋的炒饭
        FastFood food1 = new FriedRice();
        food1 = new Egg(food1);
        //花费的价格
        System.out.print(food1);
        System.out.println(food1.getPrice()+ " 元");


        //点一份加鸡蛋加牛肉的炒饭
        FastFood food2 = new FriedRice();
        food2 = new Beef(food1);
        //花费的价格
        System.out.print(food2);
        System.out.println(food2.getPrice()+ " 元");



    }

}
