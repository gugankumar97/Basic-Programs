import java.util.Arrays;

public class ReverseAArray {

	public static void main(String[] args) {
				  
			//    0 1 2 3 4
		
		int a[]= {5,4,3,2,7};
		
		int start = 0;
		int end = a.length-1;
		
		while(start <end)
		{
			int temp = a[start];
			a[start]=a[end];
			a[end]=temp;
			
			start++;
			end--;
			
		}
		
		System.out.println(Arrays.toString(a));

	}

}
