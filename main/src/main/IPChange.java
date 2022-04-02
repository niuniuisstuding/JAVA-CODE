package main;
import java.util.Scanner;

public class IPChange {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String ip = input.nextLine();
		//String newIp;
		
		for(int i = 0; i < 4; i++)
		{
			int sum = 0;
			String change = ip.substring(i * 8, (i + 1) * 8);//每8个为一组存入change字符串中
			for(int j = 0; j < 8; j++)
			{
				if(change.charAt(j) == '1')//判断change字符串的第j号下标是否为1
				   sum += Math.pow(2, 8 - j - 1);
			}
			if(i < 3)
				System.out.print(sum + ".");
			else
			System.out.println(sum);

		}
				input.close();

	}

}
