package main;
import java.util.Scanner;

public class Function {
	//����������
	//public static ����ֵ ������(��ʽ�����б�)
	//��ʽ�����б��β���ʵ�ε�һ�ݿ���
	
	//public static:��Ϊ��ǰ���з���д��֮�󣬻���main�����е���
	//main������public static��
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
