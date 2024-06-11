import java.util.HashMap;

public class FirstNonrepeat {

	public static void main(String[] args) {
		String s="abcdefghfrsgaubn";
		for(int i=0;i<s.length();i++) {
			boolean rs=true;
			for(int j=0;j<s.length();j++) {
				if(i!=j && s.charAt(i)==s.charAt(j)) {
					rs=false;

				}
				
				
			}
			if(rs) {
				System.out.println(s.charAt(i));
				break;
			}
		
		}
	}
	
}
