//Find the second smallest element in an array
package simpleproj;
import java.util.Arrays;
import java.util.Scanner;
public class P10_SecondSmallestNumber {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter number of elements: ");
		int no = ob.nextInt();
		int num[]=new int[no];
		
		System.out.println("Enter "+ no+ " elements:");
		for (int i=0; i<no; i++)
		{
			num[i] = ob.nextInt();
		}
		
		Arrays.sort(num);
		System.out.print("The second smallest element is : "+ num[1]);
		
		ob.close();
	}
}