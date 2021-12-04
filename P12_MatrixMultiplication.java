//28-11-2021//anittaS

package simpleproj;
import java.util.Scanner;
public class P12_MatrixMultiplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j,k,c1,r1,c2,r2;
		System.out.print("Enter the number of rows of matrix 1 : ");
		r1 = sc.nextInt();
		System.out.print("Enter the number of columns of matrix 1 : ");
		c1 = sc.nextInt();
		System.out.print("Enter the number of rows of matrix 2 : ");
		r2 = sc.nextInt();
		System.out.print("Enter the number of columns of matrix 2 : ");
		c2 = sc.nextInt();
		
		int a[][] = new int [r1][c1];
		int b[][] = new int [r2][c2];
		int m[][] = new int [r1][c2];
		
		if (c1 != r2)
		{
			System.out.print("Incompatible ! \n(c1 and r2 must be same.)");
		}
		else
		{
			System.out.print("Enter the elements of matrix 1: ");
			for (i=0; i<r1; i++)
			{
				for (j=0; j<c1; j++)
				{
					a[i][j] = sc.nextInt();
				}
			}
			System.out.print("Enter the elements of matrix 2: ");
			for (i=0; i<r2; i++)
			{
				for (j=0; j<c2; j++)
				{
					b[i][j] = sc.nextInt();
				}
			}
			for (i=0; i<r1; i++)
			{
				for (j=0; j<c2; j++)
				{
					for (k=0; k<c1; k++)
					{
						m[i][j] = m[i][j] + (a[i][k] * b[k][j]);
					}
				}
			}
			System.out.println("\nThe product of the matrices is:");
			for (i=0; i<r1; i++)
			{
				for (j=0; j<c2; j++)
				{
					System.out.print((m[i][j])+"\t");
				}System.out.println();
			}
		}
	}
}
