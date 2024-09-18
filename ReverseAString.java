import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String a = sc.next();
		
		for(int i=a.length()-1;i>=0;i--) {
			System.out.println(a.charAt(i));
		}

	}

}
