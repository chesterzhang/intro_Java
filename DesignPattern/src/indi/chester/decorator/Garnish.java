package indi.chester.decorator;

public abstract class Garnish extends FastFood{
    FastFood fastFood;
    public Garnish(FastFood fastFood, String garnish, int garnishPrice) {
        super(garnish,garnishPrice);
        this.fastFood=fastFood;
    }

    @Override
    public int getPrice() {
        return fastFood.getPrice()+super.getPrice();
    }

    @Override
    public String toString() {
        return fastFood.toString()+" 加 "+ super.toString() ;
    }
}
