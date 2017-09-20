import java.util.Scanner;
public class pe3 {
	public static void main(String [] args) {
	String str;
	int i,l;
	Scanner s=new Scanner(System.in);
	str=s.next();
	l=str.length();
	
	for(i=0;i<l;i++) {
		char ch=str.charAt(i);
		if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')) {
			if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'||
					ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				System.out.print("Vowel");
			}
			else {
				System.out.print("Consonant");
			}
		}
		else {
			System.out.print("Input is not a letter");
		}
	}

}
}
