package AbstractAndInterface;

public abstract class Shape {
	//构造方法，用于给子类调用
	public Shape(){}
	
	//抽象方法
	public abstract double getArea();
	
	//错误：被final修饰的类不能重写，抽象方法不能被final修饰
	//public final abstract double getArea();
}
