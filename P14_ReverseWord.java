//28-11-2021//anittaS

//java program to reverse a given string

package simpleproj;
import java.util.Scanner;
public class P14_ReverseWord 
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string:- ");
		String s=in.next();

	    String reversedStr = ""; //stores reverse
	    for(int i=s.length()-1; i>=0; i--) //Iterates from last
	    {
	    	reversedStr = reversedStr + s.charAt(i);
	    }
	    System.out.println("Original string: " + s);    
	    System.out.println("Reversed string: " + reversedStr);
	    in.close();
	}
}

/*		
		char[] ch = s.toCharArray();
	    for (int i = ch.length - 1; i >= 0; i--)
	    {
	    	System.out.print(ch[i]);		
	    }    */