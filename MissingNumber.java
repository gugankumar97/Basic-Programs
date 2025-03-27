
public class MissingNumber {

	public static void main(String[] args) {
		
		// missing number = sum of n numbers - sum of array
		// missing number = (n*(n+1))/2 - sum of array
		
		int a[]= {5,1,3,2,6,0};
		
		int n = a.length;
		
		int SumOfNumbers = (n*(n+1))/2;
		
		// to find sum of array
		
		int arraysum=0;
		
		for(int ele:a)
		{
			arraysum = arraysum+ele;
		}
		
		
		System.out.println(SumOfNumbers-arraysum);

	}

}
