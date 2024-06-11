import java.util.HashMap;
public class duplicatecharacters {

	 public static void main(String[] args) {
		 String s="javahhyyttr iss";
		 HashMap<Character,Integer> h=new HashMap<>();
		 for(int i=0;i<s.length();i++) {
			 if(!h.containsKey(s.charAt(i))) {
				 h.put(s.charAt(i), 1);
			 }
			 else {
				 System.out.println(s.charAt(i));
			 }
		 }
		 
	 }
	
}
