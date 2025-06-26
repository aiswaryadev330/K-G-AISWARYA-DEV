package programs;
import java.util.Scanner;
public class Problem3 {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.print("enter a:") ;
	int a=scan.nextInt();
	int b;
	if(a%2==0)
		b=a-1;
	else
		b=a;
	int num=1;
	for(int i=1;i<=b;i++) {
		System.out.print(num);
		if(i<b)
			System.out.print(" " );
		num=num+2;
	}
	}
}
