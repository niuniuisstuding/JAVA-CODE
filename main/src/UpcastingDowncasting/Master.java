package UpcastingDowncasting;

public class Master {
	public static void main(String[] args)
	{
		feed(new Dog("二哈"));
		feed(new Duck("小可爱"));
	}
	public static void feed(Pet pet)
	{
		System.out.println("主人开始喂食");
		pet.eat();
	}
}
