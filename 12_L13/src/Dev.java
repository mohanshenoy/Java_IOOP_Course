
public class Dev {

	public static void main(String[] args) {
		   int[] firstArray = {1, 2, 3, 4, 5};
	        int[] secondArray = {6, 7, 8, 9, 10};

	        int firstLength = firstArray.length;
	        int secondLength = secondArray.length;
	        
	        int n = firstArray.length + secondArray.length;
	        int[] mergedArray = new int[firstLength + secondLength];

	        for (int i = 0; i < firstLength; i++) {
	            mergedArray[i] = firstArray[i];
	        }

	        for (int i = 0; i < secondLength; i++) {
	            mergedArray[firstLength + i] = secondArray[i];
	        }

	        for (int num : mergedArray) {
	            System.out.print(num + " ");
	        }
	        
	        //sorted array 
	        for(int i = 0; i < n; i++) {
	        	for(int j = i + 1; j < n; j++) {
	        		if(mergedArray[j] > mergedArray[j+1]) {
	        			int temp = mergedArray[j];
	        			mergedArray[j] = mergedArray[j+1];
	        			mergedArray[j+1] = temp;
	        		}
	        	}
	        }
	        for(int i = 0; i < n; i++) {
	        	System.out.print(mergedArray[i]);
	        }
		
	}

}
