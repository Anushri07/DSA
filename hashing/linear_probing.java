
public class linear_probing {
	public static int[] linearProbing(int hash_size,int arr[],int sizeOfArray)
    {
		  int[] hashTable = new int[hash_size];
	//making all elements -1 initially
		for(int i=0;i<hash_size;i++) {
			hashTable[i]=-1;
		}
		int size=0;
        for(int j=0;j<sizeOfArray;j++) {
        	if(size == hash_size){
                break;
            }
        	int h = arr[j]%hash_size;
        	int i=h;
        	
        	while(hashTable[i]!=-1&&hashTable[i]!=arr[j]) {
        		i=(i+1)%hash_size;
        	}
        	if(hashTable[i]==arr[j]) {
    			continue;
    		}else {
    			hashTable[i]=arr[j];
    			size++;
    		} 
        }  
        return hashTable;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int arr[] = {4,14,24,44};
	System.out.println(linearProbing(10,arr,arr.length));
	}

}
