package UpcastingDowncasting;

class Duck extends Pet{
	private String name;
	public Duck(String name)
	{
		this.name = name;
	}
	public void eat()
	{
		System.out.println(this.name + "ÔÚ³ÔÑ¼Éà²Ý");
	}
}
