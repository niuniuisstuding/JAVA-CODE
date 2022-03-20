package main;
import java.util.Arrays;

public class ShuZu {

	public static void main(String[] args) {
		
		//int a;
		//System.out.println(a);//error   The local variable a may not have been initialized
		
		//数组的三种创建方法
		//数组变量属于引用类型，保存的是数组内容在堆上的地址
		//new ：实例化一个对象，内存在堆上
		//栈上的地址是拿不到的，只能拿到堆上的地址，堆上的地址也不是真实的地址，是经过处理的（哈希），但地址也是唯一的
		//
		int[] array1 = {1,2,3,4,5,6};
		int[] array2 = new int[] {11,22,33,44,55,66};
		int[] array3 = new int[6];//自动赋值0
		System.out.println(Arrays.toString(array3));
		
		int len = array1.length;//属性
		for(int i = 0; i < len; i++)
			System.out.print(array1[i] + " ");
		System.out.println();
		
		//foreach语句
		for(int val:array2)
			System.out.print(val + " ");
		
	}

}
