
public class FirstLetter {

	public static void main(String[] args) {
		String s="Boy is good";String rev="";
		String k[]=s.split(" ");
		for(int i=k.length-1;i>=0;i--) {
			rev=rev+k[i]+" ";
		}
		System.out.println(rev);
		
	}
	
}
