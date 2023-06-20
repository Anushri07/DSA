package sorting;

public class merge_sort {
	
public static void mergeSort(int a[],int m,int b[],int n) {
	int i=0,j=0;
          while(i<m && j<n) {
			if(a[i]<=b[j]) {
				System.out.print(a[i]+" ");
				i++;
			}else {
				System.out.print(b[j]+" ");
				j++;
			}
          }
			while(i<m) {
	        	  System.out.print(a[i]+" ");
	        	  i++;
	          }
			while(j<n) {
	        	  System.out.print(b[j]+" ");
	        	  j++;
	          }
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {10,20,35};
int b[]= {5,30,50,55};
mergeSort(a,a.length,b,b.length);
	}

}
