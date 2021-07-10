package indi.chester.generic;

import java.util.ArrayList;
import java.util.List;

public class GoodsSeller  {

    public GoodsSeller() {
    }

    public void sellGoods(List<? extends Goods> goods) {

        for(Goods g:goods) {
            g.sell();
        }

    }

    public static void main(String[] args) {
        GoodsSeller gs=new GoodsSeller();

        List<Goods> goods=new ArrayList<>();
        goods.add(new Shoes());
        goods.add(new Book());

        gs.sellGoods(goods);
        //输出 :
        //sell shoes
        //sell books
    }


}
