package AbstractAndInterface;

public class Customer {
	public static void main(String[] args)
	{
		//�ӿ�����ָ������
		Menu menu = new AmericanChef();
		//�������෽��ָ����ʦ���е��
		menu.tomato();
		menu = new ChineseChef();
		menu.potato();
	}
}
