package UpcastingDowncasting;

public class Master {
	public static void main(String[] args)
	{
		feed(new Dog("����"));
		feed(new Duck("С�ɰ�"));
	}
	public static void feed(Pet pet)
	{
		System.out.println("���˿�ʼιʳ");
		pet.eat();
	}
}
