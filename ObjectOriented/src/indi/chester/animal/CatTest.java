package indi.chester.animal;

public class CatTest {

    public static void main(String[] args) {

        Animal.sleep();//输出: 动物都会睡觉觉!

        Cat cat1= new Cat("鸡腿",3, "金渐层","小鱼干");
        Cat cat2= new Cat("泰哥",4, "美短","鸡肉罐头");

        cat1.eat();//输出: 鸡腿喜欢吃小鱼干!
        cat2.eat();//输出: 泰哥喜欢吃鸡肉罐头!

        System.out.println(cat1);//输出: 泰哥喜欢吃鸡肉罐头!
        System.out.println(cat2);//输出: 昵称 : 泰哥 , 品种 : 美短 , 年龄 : 4个月

        System.out.println("cat1 和 cat2 是同一个动物吗? "+ cat1.equals(cat2));//false

        System.out.println("cat1 是 Animal的实例化吗 ? "+ (cat1 instanceof  Animal));//true

    }

}
