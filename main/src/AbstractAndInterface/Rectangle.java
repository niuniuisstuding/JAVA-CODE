package AbstractAndInterface;

public class Rectangle extends Shape{
	private double width;
	private double height;
	
	//���췽��
	public Rectangle() {
		super();
	}
	public Rectangle(double width, double height)
	{
		this.width = width;
		this.height = height;
	}
	//ʵ�ּ̳еĳ�����Shape�еĳ��󷽷�getArea()
	public double getArea()
	{
		return 2 * (width + height);
	}
}
