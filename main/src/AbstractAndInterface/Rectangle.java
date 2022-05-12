package AbstractAndInterface;

public class Rectangle extends Shape{
	private double width;
	private double height;
	
	//构造方法
	public Rectangle() {
		super();
	}
	public Rectangle(double width, double height)
	{
		this.width = width;
		this.height = height;
	}
	//实现继承的抽象类Shape中的抽象方法getArea()
	public double getArea()
	{
		return 2 * (width + height);
	}
}
