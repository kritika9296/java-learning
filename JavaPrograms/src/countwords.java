import java.util.HashMap;

public class countwords {

	public static void main(String[] args) {
		String s="my name is name is name is kritika sjarma kritika";
		String str[]=s.split(" ");int c=1;
		HashMap<String,Integer> h=new HashMap<>();
		for(int i=0;i<str.length;i++) {
			if(!h.containsKey(str[i])) {
				h.put(str[i],1);
			}
			else {
				h.put(str[i],h.getOrDefault(str[i],0)+1);
			}
			
		}
		
		System.out.println(h);
	}
	
}
