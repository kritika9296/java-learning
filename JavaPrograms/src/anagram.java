import java.util.Arrays;

public class anagram {
	 public static void main(String[] args) {
		String s="mary";
		String t="ramt";
		
		char[] s1=s.toCharArray();
		char[] s2=t.toCharArray();
    	Arrays.sort(s1);
    	Arrays.sort(s2);
        
    	if(Arrays.equals(s1, s2)) {
    		System.out.println(true);
    	}
    	else {
    		System.out.println(false);
    	}
		
		
		
	 }
	
}
