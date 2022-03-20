package main;
import java.util.Scanner;

/*public class Recursion {
	//按顺序打印一个数的每一位
	public static void printDigit(int n)
	{
		if(n < 10)
			System.out.print(n + " ");
		else
		{
			printDigit(n / 10);
			System.out.print(n % 10 + " ");
		}
	}
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		printDigit(num);
		input.close();
	}
}*/



public class Recursion {
	//青蛙跳台阶
	public static int frog(int n)
	{
		if(n == 1 || 2 == n)
			return n;
		else
			return frog(n - 1) + frog(n - 2);
	}
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		System.out.println(frog(num));
	}
	

}

