package main;

public class Split {
	public static void main(String[] args)
	{
		String s = "abatbac";
		String s1 = s.replaceAll("[a-c]","*");
		System.out.println(s1);
	}
	
//²ð·Ö×Ö·û´®
	/*public static void main(String[] args) {
		String s = "boo:and-foo";
		String[] str = s.split(":|-");
		for(String val : str)
			System.out.println(val);

	}*/

}
