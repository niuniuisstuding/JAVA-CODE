package main;
import java.util.Scanner;

public class Hnuoi {
	public static void move(int n, char pose1, char pose2,char pose3)
	{
		if(n == 1)
			System.out.println(pose1 + "--->" + pose3);
		else
		{
			move(n - 1, pose1, pose3, pose2);
			System.out.println(pose1 + "--->" + pose3);
			move(n - 1, pose2, pose1, pose3);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		move(n,'A','B','C');
		input.close();

	}

}
