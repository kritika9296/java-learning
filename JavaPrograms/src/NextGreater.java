import java.util.Stack;

public class NextGreater {

	public static void main(String[] args) {
		int a[]= {1,3,2,1,8,6,3,4};
		int res[]= new int[a.length];
		Stack<Integer> s=new Stack<>();
		res[a.length-1]=-1;
		s.push(a[a.length-1]);
		for(int i=a.length-2;i>=0;i--) {
			
			while(s.size()!=0 && a[i]>s.peek()) {
				s.pop();
			}
				if(s.isEmpty()) {
					res[i]=-1;
			}
				else {
					res[i]=s.peek();
				}
				
				s.push(a[i]);
				
		}
		
		for( int j=0;j<res.length;j++) {
			System.out.print(res[j]);
		}
		
	}
	
}
