package programs;
import java.util.Scanner;
public class Problem1 {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter the first number:");
	double a = scan.nextDouble();
	System.out.print("Enter the second  number:");
	double b = scan.nextDouble();
	System.out.println("Enter the type of operation:add,sub,mul,div:");
	String ch = scan.next();
	
	if(ch.equals("add"))
		System.out.println("Result=" + (a+b));
	else if(ch.equals("sub"))
		System.out.println("Result=" + (a-b));
	else if(ch.equals("mul"))
		System.out.println("Result=" + (a*b));
	else if(ch.equals("div"))
		if(b!=0) 
		System.out.println("Result=" + (a/b));
		else
		System.out.println("division by zero");
		
	
	else
		System.out.println("invalid choice");
	
	
		

	}

}
