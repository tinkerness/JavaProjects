//22-11-2021
package simpleproj;
import java.util.Scanner;
public class P5_GradeFromMarks {

	public static void main(String[] args) {
		String name,grade="";
		int roll;
		float atnd,marks,atndmark=0;
		Scanner ob = new Scanner(System.in);
		
		System.out.print("Enter student's name: ");
		name = ob.next();
		System.out.print("Enter roll num: ");
		roll = ob.nextInt();
		System.out.print("Enter percentage attendance: ");
		atnd = ob.nextFloat();
		System.out.print("Enter marks: ");
		marks = ob.nextFloat();
		
		if (atnd >= 90 && atnd <= 100)
			atndmark = 10;
		else if (atnd >= 0)
			atndmark = atnd/10;
		
		/* KTU Grading System */
		if (marks >= 0 && marks <= 100)
		{	if (marks >= 90)
				grade = "S";
			else if (marks >= 85)
				grade = "A+";
			else if (marks >= 80)
				grade = "A";
			else if (marks >= 75)
				grade = "B+";
			else if (marks >= 70)
				grade = "B";
			else if (marks >= 65)
				grade = "C+";
			else if (marks >= 60)
				grade = "C";
			else if (marks >= 55)
				grade = "D";
			else if (marks >= 50)
				grade = "P";
			else
				grade = "F";
		}
		else
		{
			grade = "_ (null) _";
			System.out.println("Enter marks between 0 - 100 !!");
		}
		
		System.out.println(name+ ", roll num: " +roll+ " , has got "+ atndmark + " marks for attendance and " +grade +" grade for the subject.");
		
		ob.close();

	}
}