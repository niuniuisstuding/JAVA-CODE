package main;

public class Function2 {
	//����������
	//   1.��������ͬ
	//   2.����ֵ����Ҫ��
	//   3.�����б�ͬ���������� ���� �������� ��ͬ��
	//   4.ͬһ������
	public static int sum(int x, int y)
	{
		return x + y;
	}
	public static double sum(double x, double y)
	{
		return x + y;
	}

	public static void main(String[] args) {
		int a = 10, b = 20;
		System.out.println(sum(a,b));
		
		double c = 2.5, d = 5.1;
		System.out.println(sum(c,d));
	}

}
