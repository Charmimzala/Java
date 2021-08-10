import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
	
	A1 a1= new A1();
	B2 b1 =new B1();
	String s1=a1.getName();
	String s2=b1.getName();
	
	s1=s1.toLowerCase();
	s2=s2.toUpperCase();
	s1=s1.substring(0,1).toUpperCase() + s1.substring(1);	
	System.out.println(s1 + " " + s2);
	}
}

class A1
{	
	Scanner scr= new Scanner(System.in);
	
	public String getName()
	{
		String s1=scr.nextLine();
		return s1;
	}
	
}

class B1
{
	Scanner scr= new Scanner(System.in);
	
	public String getName()
	{
		String s1=scr.nextLine();
		return s1;
		
	}
}
