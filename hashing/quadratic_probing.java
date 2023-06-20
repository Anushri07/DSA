
public class quadratic_probing {
	public static void quadraticProbing(int[] hash,int hash_size,int arr[],int N)
    {
		int size=0;
        for(int i=0;i<N;i++) {
        	if(size==hash_size) {
        		break;
        	}
        	// Computing the hash value
        	int h=arr[i]%hash_size;
        	int k=h;
        	while(hash[k]!=-1&&hash[k]!=arr[i]) {
        		k=(k*k+1)%hash_size;
        	}
        	if(hash[k]==arr[i]) {
        		continue;
        	}else {
        		hash[k]=arr[i];
        		size++;
        	}
        }
        System.out.println(hash);
    }
	public static void quadraticProbing2(int[] hash,int hash_size,int arr[],int N)
    {
		int size=0;
		for (int i = 0; i <hash_size; i++) {
            hash[i] = -1;
        }
        for(int i=0;i<N;i++) {
        	if(size==hash_size) {
        		break;
        	}
        	// Computing the hash value
        	int h=arr[i]%hash_size;

            // Insert in the table if there is no collision
            if (hash[h] == -1) {
                hash[h] = arr[i];
            }else {
            	 // If there is a collision iterating through all
                // possible quadratic values
            	for(int j=i;j<N;j++) {
            		// Computing the new hash value
                    int t = (h + j * j) %hash_size;
                    if(hash[t]==-1) {
                    	//break the loop after inserting an element
                    	hash[t]=arr[i];
                    	break;
                    }
            	}
            }
        }
        System.out.println(hash);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {21,10,32,43};
		int hash[] = {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
		quadraticProbing2(hash,10,arr,arr.length);
	}

}
