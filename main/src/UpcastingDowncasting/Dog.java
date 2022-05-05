package UpcastingDowncasting;

public class Dog extends Pet{
	private String name;
	public Dog() {
		name = null;
	}
	public Dog(String name)
	{
		this.name = name;
	}
	public void eat()
	{
		System.out.println(this.name + "ÔÚ¿Ð¹ÇÍ·");
	}
}
