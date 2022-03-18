package main;
import java.util.Scanner;

public class ParityBinaryBits {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		for(int i = 31; i >= 1; i -= 2)
		{
			//打印二进制序列的奇数位
			System.out.print(((n >> i) & 1) + " ");
		}
		System.out.println();
		for(int i = 30; i >= 0; i -= 2)
		{
			//打印二进制序列的奇数位
			System.out.print(((n >> i) & 1) + " ");
		}
		input.close();
	}

}
