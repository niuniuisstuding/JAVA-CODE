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
			String change = ip.substring(i * 8, (i + 1) * 8);//ÿ8��Ϊһ�����change�ַ�����
			for(int j = 0; j < 8; j++)
			{
				if(change.charAt(j) == '1')//�ж�change�ַ����ĵ�j���±��Ƿ�Ϊ1
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
