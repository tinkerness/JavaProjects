//28-11-2021//anittaS

package simpleproj;
import java.util.Scanner;
public class P13_MatrixTranspose {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,j,c,r;
		System.out.print("Enter the number of rows: ");
		r = sc.nextInt();
		System.out.print("Enter the number of columns: ");
		c = sc.nextInt();
		int a[][] = new int [r][c];
		
		System.out.print("Enter the elements of matrix : ");
		for (i=0; i<r; i++)
		{
			for (j=0; j<c; j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\nThe entered matrix is:");
		for (i=0; i<r; i++)
		{
			for (j=0; j<c; j++)
			{
				System.out.print((a[i][j])+"\t");
			}System.out.println();
		}

		System.out.println("\nThe transpose of the matrix is:");
		for (i=0; i<r; i++)
		{
			for (j=0; j<c; j++)
			{
				System.out.print((a[j][i])+"\t");
			}System.out.println();
		}
	}
}