//28-11-2021//anittaS
package simpleproj;
import java.util.Scanner;
public class P9_StudentRecord {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.print("Enter number of students: ");
		int no = ob.nextInt();
		int r[]=new int[no];
		//String name[]=new String[no];
		int m1[]=new int[no];
		int m2[]=new int[no];
		int m3[]=new int[no];
		
		for (int i=0; i<no; i++)
		{
			//System.out.print("\nEnter name of student: ");
			//name[i] = ob.next();
			System.out.print("\nEnter roll num: ");
			r[i] = ob.nextInt();
			System.out.print("Enter marks in subject1: ");
			m1[i] = ob.nextInt();
			System.out.print("Enter marks in subject2: ");
			m2[i] = ob.nextInt();
			System.out.print("Enter marks in subject3: ");
			m3[i] = ob.nextInt();
		}
		ob.close();
	}
}