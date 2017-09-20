import java.util.Scanner;
public class pe1 {
	
	public static void main(String [] args) {
		long a;
		Scanner s= new Scanner(System.in);
		a=s.nextLong();
		
		palindrome(a);
		
	}
	
	
	public static void palindrome(long a) {
		long temp,r,sum=0,digsum=0;
	

		temp=a;
		
		while(temp>0) {
			r=temp%10;
			sum=(sum*10)+r;
			temp=temp/10;
			if(r%2==0) {
			digsum+=r;
			}
			}
		
		if(a==sum) {
		
		System.out.print(a + " is a palindrome number and");
		 if(digsum>25) {
			 System.out.println(" and sum of all even numbers is greater than 25" );
		 }
		 else if(digsum<25) {
			 System.out.println(" and sum of all even numbers is less than 25" );
		 }
		 else {
			 System.out.println(" and sum of all even numbers is equal to 25" );
		 }

	}
		else {
			System.out.print(a + " is not a palindrome number");
		}
		
	}
	
	

}
