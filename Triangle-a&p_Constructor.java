/*
 * Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' with constructor having the three sides as its parameters.
 */
package mod2;
class Triangle
{
	int s1,s2,s3;
	Triangle (int a, int b, int c)
	{
		s1=a;
		s2=b;
		s3=c;
	}
	double perimeter()
	{
		return (s1+s2+s3);
	}
	double area()
	{
		//Heron's formula
		double p = (s1+s2+s3)/2;
		return Math.pow((p*(p-s1)*(p-s2)*(p-s3)),0.5);
	}
}
public class P5_AAndPOfTri_SidesAsPara {
	public static void main(String[] args) {
		Triangle t = new Triangle(3,4,5);
		
		System.out.println("Area: "+t.area());
		System.out.println("Perimeter: "+t.perimeter());
	}
}

/*
OUTPUT:
Area: 6.0
Perimeter: 12.0

*/
