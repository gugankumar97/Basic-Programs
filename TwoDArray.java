import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
	
		int a[][]= {{5,8,7,3},
					{9,8,2,5},
					{4,2,0,0}};
		
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]);
			}
			
			System.out.println();
		}
		
	

	}

}
