package main;

public class Function2 {
	//方法的重载
	//   1.方法名相同
	//   2.返回值不作要求
	//   3.参数列表不同（参数个数 或者 参数类型 不同）
	//   4.同一个类中
	public static int sum(int x, int y)
	{
		return x + y;
	}
	public static double sum(double x, double y)
	{
		return x + y;
	}

	public static void main(String[] args) {
		int a = 10, b = 20;
		System.out.println(sum(a,b));
		
		double c = 2.5, d = 5.1;
		System.out.println(sum(c,d));
	}

}
