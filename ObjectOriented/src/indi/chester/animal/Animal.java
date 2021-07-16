package indi.chester.animal;

public abstract class Animal {

    private String name;
    private int month;
    private String species;

    protected Animal(String name, int month, String species) {
        this.setName(name);
        this.setMonth(month);
        this.setSpecies(species);
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected int getMonth() {
        return month;
    }

    protected void setMonth(int month) {
        this.month = month;
    }

    protected String getSpecies() {
        return species;
    }

    protected void setSpecies(String species) {
        this.species = species;
    }

    // 睡觉觉方法
    public static void sleep() {
        System.out.println("动物都会睡觉觉!");
    }

    protected abstract void eat() ;

    // 重写Object类的equals方法,用来判断"两个"动物是否是一个动物
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Animal temp = (Animal) obj;// 要保证obj 可以转换为Animal 类型
            if (this.getName() == (temp.getName()) && this.getMonth() == temp.getMonth()
                    && this.getSpecies() == temp.getSpecies()) {
                return true;
            } else {
                return false;
            }
        } catch (java.lang.ClassCastException e) {
            e.printStackTrace();
            return false;
        }

    }

    // 重载Animal类的equals方法
    public boolean equals(Animal obj) {

        if (this.getName() == (obj.getName()) && this.getMonth() == obj.getMonth()
                && this.getSpecies() == obj.getSpecies()) {
            return true;
        } else {
            return false;
        }

    }

    // 重写toString方法
    @Override
    public String toString() {
        return "昵称 : " + this.getName() + " , 品种 : "+this.getSpecies()+" , 年龄 : " + this.getMonth() + "个月";
    }

}
