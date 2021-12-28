package indi.chester.mybatis.dto;

import indi.chester.mybatis.entity.Goods;

public class GoodsDTO {
    private Goods goods=new Goods() ;
    private String categoryName;

    public Goods getGoods() {
        return goods;
    }

    public String getCategoryName() {
        return categoryName;
    }
}
