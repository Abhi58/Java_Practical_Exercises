import java.util.Scanner;
public class pe6 {

	public static void main(String [] args) {
		String str;
		Scanner s=new Scanner(System.in);
		str=s.next();
		char ch=str.charAt(0);
		
		if(ch>='a' && ch<='z'){
			System.out.println("Small Letter");
		}
		else if(ch>='A' && ch<='Z') {
			System.out.println("Capital Letter");
		}
		
		else if(ch>='0' && ch<='9') {
			System.out.println("Number");
		}
		
		else {
			System.out.println("Special Symbol");
		} 
		
		s.close();
		
}

}