import java.util.Scanner;
import java.lang.String;
public class pe10 {

	public static void main(String [] args) {
		String s;
		
		int n;
		
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		n=sc.nextInt();
		String s1[]=new String[n];
		for(int i=0;i<n;i++) {
		s1[i]=s.substring(s.length()-n);
		}
		for(int i=0;i<n;i++) {
			s=s+s1[i];
		}
		System.out.println(s);
		sc.close();
	}
}
