package main;
import java.util.Arrays;

public class ShuZu {

	public static void main(String[] args) {
		
		//int a;
		//System.out.println(a);//error   The local variable a may not have been initialized
		
		//��������ִ�������
		//������������������ͣ�����������������ڶ��ϵĵ�ַ
		//new ��ʵ����һ�������ڴ��ڶ���
		//ջ�ϵĵ�ַ���ò����ģ�ֻ���õ����ϵĵ�ַ�����ϵĵ�ַҲ������ʵ�ĵ�ַ���Ǿ�������ģ���ϣ��������ַҲ��Ψһ��
		//
		int[] array1 = {1,2,3,4,5,6};
		int[] array2 = new int[] {11,22,33,44,55,66};
		int[] array3 = new int[6];//�Զ���ֵ0
		System.out.println(Arrays.toString(array3));
		
		int len = array1.length;//����
		for(int i = 0; i < len; i++)
			System.out.print(array1[i] + " ");
		System.out.println();
		
		//foreach���
		for(int val:array2)
			System.out.print(val + " ");
		
	}

}
