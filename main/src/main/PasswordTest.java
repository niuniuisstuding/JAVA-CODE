package main;
import java.util.Scanner;

public class PasswordTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("���������룺");
		String s = input.nextLine();
		String regex = "^[a-zA-Z]\\w{5,17}$";
		while(!(s.matches(regex)))
		{
			System.out.println("���벻�Ϸ������������룡");
			s = input.nextLine();
		}
		System.out.println("ע��ɹ�!");
		input.close();
    }

}
