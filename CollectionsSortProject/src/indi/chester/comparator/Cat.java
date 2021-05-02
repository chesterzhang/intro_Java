package indi.chester.comparator;

public class Cat {
	
	private String name;
	private int month;
	private String species;
	
	public Cat(String name, int month, String species) {
		super();
		this.name = name;
		this.month = month;
		this.species = species;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public String getSpecies() {
		return species;
	}
	
	public void setSpecies(String species) {
		this.species = species;
	}

	
	//重写object类的toString方法，详见java文档 java.base.lang object类
	@Override
	public String toString() {
		return "Cat [name=" + name + ", month=" + month + ", species=" + species + "]";
	}

}
