package simpleproj;
import java.util.Scanner;
public class P4_ConcatanateString {

	public static void main(String[] args) {
		String a,b;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string1");
		a=sc.next();
		System.out.println("Enter string2");
		b=sc.next();
		
		System.out.println("The concatanated string is :- " +a+" "+b);
		sc.close();
	}
}