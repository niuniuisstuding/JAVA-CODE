package UpcastingDowncasting;

public class Master {
	public static void main(String[] args)
	{
		feed(new Dog("����"));
		feed(new Duck("С�ɰ�"));
	}
	/*public static void feed(Dog dog)
	{
		System.out.println("���˿�ʼιʳ");
		dog.eat();
	}
	public static void feed(Duck duck)
	{
		System.out.println("���˿�ʼιʳ");
		duck.eat();
	}*/
	
	//�β�Ϊ���࣬ʵ��Ϊ������
	public static void feed(Pet pet)
	{
		System.out.println("���˿�ʼιʳ");
		pet.eat();
	}
}
