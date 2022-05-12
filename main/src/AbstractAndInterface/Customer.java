package AbstractAndInterface;

public class Customer {
	public static void main(String[] args)
	{
		//接口引用指向子类
		Menu menu = new AmericanChef();
		//调用子类方法指定厨师进行点菜
		menu.tomato();
		menu = new ChineseChef();
		menu.potato();
	}
}
