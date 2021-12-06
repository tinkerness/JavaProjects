/*
 * 06/12/2021
 * Write a Java program to calculate the area of different shapes namely circle, rectangle, and triangle using the concept of method overloading.
 */
package mod2;
import java.util.Scanner;
class Area1
{
	void area (float x)
	{
		double a = 3.14*x*x;
		System.out.print("\nArea of Circle with radius: "+x+" is: "+a);
	}
	
	void area (int x,int y)
	{
		int a = x*y;
		System.out.print("\nArea of Rectangle with width: "+x+ " and length: "+y+" is: " +a);
	}
	
	void area (float x,float y)
	{
		double a = (x*y)/2;
		System.out.print("\nArea of Triangle with base: "+x+ " and height: "+y+" is: " +a);
	}
}

public class P17_AreaOfDifferentShapes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Base of the Triangle ");
		float b = sc.nextFloat();
		System.out.print("Enter the Height of the Triangle ");
		float h = sc.nextFloat();
		System.out.print("Enter the width of the Rectangle ");
		int x = sc.nextInt();
		System.out.print("Enter the Height of the Rectangle ");
		int y = sc.nextInt();
		System.out.print("Enter the Radius of the Circle ");
		float r = sc.nextFloat();
		
		
		Area1 ob = new Area1();
		ob.area(b,h);
		ob.area(x,y);
		ob.area(r);
		
		sc.close();
	}
}

/*
 * Enter the Base of the Triangle 12.5

 Enter the Height of the Triangle 13.5 

Enter the width of the Rectangle 15 

Enter the Height of the Rectangle 30 

Enter the Radius of the Circle 17.5

Area of Triangle with base: 12.5 and height: 13.5 is: 84.375 

Area of Rectangle with width: 15 and length: 30 is: 450 

Area of Circle with radius: 17.5 is: 961.625
 */
