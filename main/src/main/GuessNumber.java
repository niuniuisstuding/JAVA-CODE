package main;
//import java.util.Random;
import java.util.*;//����java.utiil�����еİ�

public class GuessNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Random random = new Random();
		int randNum = random.nextInt(100);//[0 - 100)
		//int random = random.nextInt(100) + 100; //[100 - 200)
		//int random = (int)(Math.random() * 90) + 10
		//Math.random()�᷵��һ���������doubleֵ��[0.0 , 1.0)
		//[0.0,1.0) * 90 = [0.0,90.0) (int)��doubleת����int  [10,100)
		
		while(true)
		{
			System.out.println("��������µ����֣� ");
			int num = input.nextInt();
			if(num < randNum)
				System.out.println("��µ�����С��!");
			else if(num == randNum)
			{
				System.out.println("��µ����ֶ���!");
				break;
			}
			else
				System.out.println("��µ����ִ���!");
		}
	}

}
