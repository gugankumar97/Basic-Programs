import java.util.Arrays;

public class MoveZeros {

	public static void main(String[] args) {
		
		int a[]= {0,5,0,0,4};
		
		int nz = 0; // index (it is for non zero elements)
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				a[nz] = a[i];
				nz++;
			}
		}
		
		for(int i=nz;i<a.length;i++)
		{
			a[i]=0;
		}
		System.out.println(Arrays.toString(a));   // to print in a single line

	}

}
