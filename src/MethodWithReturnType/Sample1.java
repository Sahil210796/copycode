package MethodWithReturnType;

public class Sample1
{
	public static void main(String[] args)
	{
		int num1=5;
		int num2 = add(10, 20);
	
		System.out.println(num1*num2);
		
		System.out.println("-----");
				
		System.out.println(add(7, 8));
		
		
		System.out.println("----------------------");
		
		Sample1 s1=new Sample1();
		String str1 = s1.convertNameToUpperCase("rahul");
		System.out.println(str1);
		
		System.out.println("---");
		
		
		System.out.println(s1.convertNameToUpperCase("mahesh"));
		
	}
	
	
	public static int add(int a, int b) 
	{
		int c=a+b;   //10+20=30
		
		return c;
	}
	
	
	
	public String convertNameToUpperCase(String inp) 
	{
		return inp.toUpperCase();
	}
	

}
