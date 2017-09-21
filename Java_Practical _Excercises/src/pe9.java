import java.util.Scanner;
public class pe9 {

	public static void main(String [] args) {
		String s;
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		char ch[]=new char[1000];
		char ch1[]=new char[1000];
		int l=s.length();
		for(int i=0;i<l;i++) {
			ch[i]=s.charAt(i);
			ch1[i]=ch[i];
		}
		
		for(int i=0;i<l;i++) {
			ch[i]=ch1[l-i-1];
		}
		for(int i=0;i<l;i++) {
			System.out.print(ch[i]);
		}
		
	}
}
