package indi.chester.decorator;

public abstract class FastFood {

    private String  food;
    private int price;

    public FastFood( String food,int price) {
        this.food = food;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return food ;
    }
}
