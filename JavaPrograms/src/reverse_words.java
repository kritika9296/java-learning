
public class reverse_words {
    public static void  main(String args[]) {
    	String s1="Hello words";
    	String[] Str=s1.split(" ");
    	for(int i=0;i<Str.length;i++) { 	
    		for(int j=Str[i].length()-1;j>=0;j--) {
    			System.out.print(Str[i].charAt(j));
    		}
    		System.out.print(" ");
    	}
    }
}
