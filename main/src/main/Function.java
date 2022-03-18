package main;
import java.util.Scanner;

public class Function {
	//方法：功能
	//public static 返回值 方法名(形式参数列表)
	//形式参数列表：形参是实参的一份拷贝
	
	//public static:因为当前所有方法写完之后，会在main方法中调用
	//main方法是public static的
	public static int maxNum(int n1, int n2)
	{
		return n1 > n2 ? n1 : n2;
	}
	public static int maxThreeNum(int n1, int n2, int n3)
	{
		return maxNum(maxNum(n1,n2), n3);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1 = input.nextInt(), n2 = input.nextInt(), n3 = input.nextInt();
		System.out.println(maxThreeNum(n1, n2, n3));

	}

}
