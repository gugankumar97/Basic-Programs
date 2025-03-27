import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	
	public static boolean checkAnagram(String a, String b)
	{
		// convert string to charArray.
		// sort it.
		// again convert to string
		
		char c1[]=a.toCharArray();
		Arrays.sort(c1);
		a = String.valueOf(c1);
		
		char c2[]=b.toCharArray();
		Arrays.sort(c2);
		b = String.valueOf(c2);
		
		if(a.equals(b))
			return true;
			return false;
			
		
		
	}
	
	public static void main(String[] args) {
		
		/*
		 * a = silent and b = listen
		 * both have same length and same characters
		 * so it is anagram
		 * 
		 * By sorting we can acheive this
		 */
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Strings: ");
		String a = sc.next();
		String b = sc.next();	
		System.out.println(checkAnagram(a,b));
		

	}

}
