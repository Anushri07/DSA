package searching;

public class majority_element {
	public static int majorityElement(int a[], int size)
    {
        // your code here
        int count=1;
         if(size==0){
        return -1;
         }
        if(size==1)
           return a[0];
        
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(a[i]==a[j]){
                    count++;
                    if(count>size/2){
                        return a[i];
                    }else
                    {
                        l=a[i];
                        n=1;
                    }
                }
            }
            
        }
        return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[] = {1,13};
System.out.println(majorityElement(a,a.length));
	}

}
