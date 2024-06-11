
public class secodmax {

	public static void  main(String[] args) {
		int a[]= {1,4,2,6,456,23,67};
		int max=Integer.MIN_VALUE; 	int smax=Integer.MIN_VALUE; int tmax=Integer.MIN_VALUE; 
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
			if(a[i]>smax && a[i]<max) {
				smax=a[i];
			}
			if(a[i]>tmax && a[i]<smax) {
				tmax=a[i];
			}
		}
		System.out.println(max + " " + smax + " " +tmax);
	}
}
