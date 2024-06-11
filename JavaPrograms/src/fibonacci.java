import java.util.Arrays;
import java.util.HashMap;

public class fibonacci {
		 public static void main(String[] args) {
		int first=0,second=1;int n=10;
		    for(int i=0;i<=n;i++) {
		    	System.out.print(first + " ");
		    	int third= first+second;
		    	first=second;
		    	second=third;
		    }
			
			
		 }
	
	
}
