import java.util.Scanner;
public class pe8 {
	static int num=51;
	public static void main(String [] args) {
		
		int n;
		Scanner sc=new Scanner(System.in);
			System.out.println("Guess the number between 1-100");
		
		do {
			n=sc.nextInt();
			if(n>num) {
				System.out.println("Number guessed is more than original number");
			}
			else if(n<num) {
				System.out.println("Number guessed is less than original number");
			}
			
		}while(n!=num);
		if(n==num) {
			System.out.println("Number guessed matches the original number");
		}
		sc.close();
		
	}
}
