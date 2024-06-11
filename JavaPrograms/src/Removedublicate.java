import java.util.ArrayList;

public class Removedublicate {

	public static void main(String[] args) {
		String s="Sandeeep"; String rev="";
		ArrayList<Character> h=new ArrayList<>();
		for(int i=0;i<s.length();i++) {
			if(h.contains(s.charAt(i))) {
				continue;
			}
			else {
				h.add(s.charAt(i));
				rev=rev+s.charAt(i);
			}
		}
		
		System.out.println(rev);
		
		
	}
	
}
