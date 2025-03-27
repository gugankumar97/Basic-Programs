import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows of m1");
		int row1 = sc.nextInt();
		System.out.println("Enter the no of columns of m1");
		int col1 = sc.nextInt();
		
		System.out.println("Enter the no of rows of m2");
		int row2 = sc.nextInt();
		System.out.println("Enter the no of columns of m2");
		int col2 = sc.nextInt();
		
		int a[][]=new int[row1][col1];
		int b[][]=new int[row2][col2];
		
		int c[][] = new int [row2][col2]; // u can take any one m1 or m2
		
		if(row1==row2 && col1==col2)
		{
			System.out.println("Enter the elements of m1 : ");
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[i].length;j++)
				{
					System.out.println("Enter for "+i+","+j+",");
					a[i][j]=sc.nextInt();
				}
			}
			
			System.out.println("Enter the elements of m2 :");
			for(int i=0;i<b.length;i++)
			{
				for(int j=0;j<b[i].length;j++)
				{
					System.out.println("Enter for "+i+","+j+",");
					b[i][j]=sc.nextInt();
				}
			}
			
			System.out.println("Addition of m1 and m2");
			for(int i=0;i<b.length;i++)
			{
				for(int j=0;j<b[i].length;j++)
				{
					c[i][j] = a[i][j] + b[i][j];
				}
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		else
		{
			System.out.println("Enter the rows and columns correctly");
		}

	}

}
