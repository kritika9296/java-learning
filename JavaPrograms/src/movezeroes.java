public class movezeroes {

	public static void main(String[] args) {
		int[] a= {0,1,0,0,1,1,1,0,0,1,0,0};
		int nz= a.length-1;int z= a.length-1;
		while(nz>0) {
			if(a[nz]==1) {
				int t=a[z];
				a[z]=a[nz];
				a[nz]=t;
				nz--;z--;
			}
			else {
				nz--;
			}
		}
	for(int j=0;j<a.length;j++) {
		System.out.print(a[j]+" ");
	}
	}
}
