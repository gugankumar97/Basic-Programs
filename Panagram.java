import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Panagram {

	public static void main(String[] args) {
		
		Set<Character> s = new HashSet<>(List.of('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','x','y','z'));
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Sentence: ");
		String str = sc.nextLine();
		
		//The quick brown fox jumps over the lazy dog
		
		for(int i=0;i<str.length();i++)
		{
			char c = str.charAt(i);
			s.remove(c);
		}
		
		if (s.isEmpty()) {
			System.out.println("It is a panagram");
		}else
			System.out.println("Not a panagram");
		

	}

}
