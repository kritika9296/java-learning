
import java.util.HashMap;
import java.util.Stack;
public class Stakprogram {

	public static void main(String[] args) {
		int[] a= {1,1,2,2,2,3,10,10,10,2,3,4,5,7};
		Stack<Integer> h=new Stack<>();
		for(int i=0;i<a.length;i++) {
			if(h.isEmpty()) {
				h.push(a[i]);
			}
			else	 if(h.peek()!=a[i]) {
			 h.push(a[i]);
			}
			else if( h.peek()==a[i]) {
			 if(a[i]!=a[i+1] || i==a.length-1) {
				 h.pop();
			 }
		 }
		}
		System.out.println(h);
		}
			
}
