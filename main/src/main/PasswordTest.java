package main;
import java.util.Scanner;

public class PasswordTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入密码：");
		String s = input.nextLine();
		String regex = "^[a-zA-Z]\\w{5,17}$";
		while(!(s.matches(regex)))
		{
			System.out.println("密码不合法，请重新输入！");
			s = input.nextLine();
		}
		System.out.println("注册成功!");
		input.close();
    }

}
