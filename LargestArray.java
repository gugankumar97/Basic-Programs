import java.util.Scanner;

public class LargestArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements: ");
		
		int a[] = new int[5];
		
		
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		
		int max=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
				max = a[i];
		}
		
		System.out.println("The Largest Number in the Array :" +max);
		
	}
	
}
