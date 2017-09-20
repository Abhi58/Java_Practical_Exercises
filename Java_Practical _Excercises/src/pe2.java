import java.util.Scanner;
public class pe2 {
	
	public static void main(String [] args) {
	int num;
	
	Scanner s=new Scanner(System.in);
	num=s.nextInt();
	
	if(num>=20 && num<=30 && num%2!=0) {
	   System.out.println("Tom");
	}
	
	else if(num>=20 && num<=30 && num%2==0) {
		   System.out.println("Jerry");
		}
	}

}
