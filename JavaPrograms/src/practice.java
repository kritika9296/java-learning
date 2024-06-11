import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class practice {
	
	
	public static void rev(String s) {
		String rev="";
		Stack<Character> h=new Stack<>();
		for( int i=0;i<s.length();i++) {
			h.push(s.charAt(i));
		}
		while(!h.isEmpty()) {
			System.out.print(h.peek());
			h.pop();
		}
		
		
	}

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string");
		String k=sc.next();
		 rev(k);
		//System.out.println(k);
		
	}
	
	
}
