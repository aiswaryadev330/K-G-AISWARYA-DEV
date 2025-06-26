package programs;
import java.util.Scanner;
public class Problem2 {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter number:");
		int number=scan.nextInt();
		int num=1;
		for(int i=1;i<=number;i++) {
			System.out.print(num);
			System.out.print(" , ");
			num+=2;
			
			
		}
		
	}

}
