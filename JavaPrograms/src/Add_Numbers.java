
public class Add_Numbers {

	public static void main(String[] args) {
		String str="hi123whyur3dgjnr45sdgsdgs1";
		String num="";int sum=0;
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				num=num+str.charAt(i);
			}
			else if(!num.equals("")){
				sum=sum+Integer.parseInt(num);
				num="";
		    }
		}
		 if(!num.equals(""))
				sum=sum+Integer.parseInt(num);
		System.out.println(sum);
	
}
}
