package indi.chester.generic;

public class NumGeneric<E> {

    private E num;

    public NumGeneric(E num) {
        this.num = num;
    }

    public E getNum() {
        return num;
    }

    public static void main(String[] args) {

        NumGeneric<Double> numObj= new NumGeneric<>(25.0);

        System.out.println("Num : "+ numObj.getNum());

    }
}

