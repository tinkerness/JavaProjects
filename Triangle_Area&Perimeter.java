/*
 * Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' without any parameter in its constructor.
 */

package mod2;
class Triangle
{
	int a,b,c;
	double perimeter()
	{
		return (a+b+c);
	}
	double area()
	{
		//Heron's formula
		double p = (a+b+c)/2;
		return Math.pow((p*(p-a)*(p-b)*(p-c)),0.5);
	}
}

public class P4_AAndPOfTriangle_NoParameter {
	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.a = 3;
		t.b = 4;
		t.c = 5;
		System.out.println("Area: "+t.area());
		System.out.println("Perimeter: "+t.perimeter());
	}
}

/*
OUTPUT:
Area: 6.0
Perimeter: 12.0
*/
