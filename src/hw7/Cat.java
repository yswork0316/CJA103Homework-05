package hw7;

import java.io.Serializable;

public class Cat extends Animal implements Serializable {
	private static final long serialVersionUID = 8315449942815314809L;
	private String name;
	
	public Cat(String name) {
		this.name = name;
	}
	
	public void speak() {
		System.out.println("This is Cat " + name + " speaking!");
	}
	
}
