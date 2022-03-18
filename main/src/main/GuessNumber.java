package main;
//import java.util.Random;
import java.util.*;//导入java.utiil下所有的包

public class GuessNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Random random = new Random();
		int randNum = random.nextInt(100);//[0 - 100)
		//int random = random.nextInt(100) + 100; //[100 - 200)
		//int random = (int)(Math.random() * 90) + 10
		//Math.random()会返回一个大于零的double值，[0.0 , 1.0)
		//[0.0,1.0) * 90 = [0.0,90.0) (int)把double转换成int  [10,100)
		
		while(true)
		{
			System.out.println("请输入你猜的数字： ");
			int num = input.nextInt();
			if(num < randNum)
				System.out.println("你猜的数字小了!");
			else if(num == randNum)
			{
				System.out.println("你猜的数字对了!");
				break;
			}
			else
				System.out.println("你猜的数字大了!");
		}
	}

}
