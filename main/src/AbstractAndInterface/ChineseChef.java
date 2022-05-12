package AbstractAndInterface;

public class ChineseChef implements Menu{
	//构造方法
	public ChineseChef() {

	}
	//实现接口中的抽象方法
	public void tomato()
	{
		System.out.println("中国厨师做的西红柿炒鸡蛋");
	}
	public void potato()
	{
		System.out.println("中国厨师做的拔丝地瓜");
	}
}
