//28-11-2021//anittaS

package simpleproj;
import java.util.Scanner;
public class P11_5_MatrixSubtraction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j,c,r;
		System.out.print("Enter the number of rows: ");
		r = sc.nextInt();
		System.out.print("Enter the number of columns: ");
		c = sc.nextInt();
		
		int a[][] = new int [r][c];
		int b[][] = new int [r][c];
		int m[][] = new int [r][c];
		
		System.out.print("Enter the elements of matrix 1: ");
		for (i=0; i<r; i++)
		{
			for (j=0; j<c; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		System.out.print("Enter the elements of matrix 2: ");
		for (i=0; i<r; i++)
		{
			for (j=0; j<c; j++)
			{
				b[i][j] = sc.nextInt();
			}
		}
		for (i=0; i<r; i++)
		{
			for (j=0; j<c; j++)
			{
				m[i][j] = a[i][j] - b[i][j];
			}
		}
		System.out.println("\nThe difference of the matrices is:");
		for (i=0; i<r; i++)
		{
			for (j=0; j<c; j++)
			{
				System.out.print((m[i][j])+"\t");
			}System.out.println();
		}
	}
}