package indi.chester.factory;

public class HomePageSelector {
    public static void main(String[] args) {

        //通过 工厂类 来实例化一个对象
        // 对象类型为接口, 但并不是真的实例化一个接口, 接口本身是不能被实例化的
        IHomePage hp1 = HomePageFactory.getHomePage("China");
        IHomePage hp2 = HomePageFactory.getHomePage("USA");


        System.out.println(hp1.showInfo());//输出:这是中文首页.
        System.out.println(hp2.showInfo());//输出:This USA home page.

    }
}
