class Solution{
  public int[] addNegabinary(int[] arr1, int[] arr2) {
      
       int[] arr = new int[arr1.length>arr2.length?arr1.length+2:arr2.length+2];
		int len = (arr1.length<arr2.length?arr1.length:arr2.length) - 1;

		     for(int i = 0; i<arr.length-2; i++){
		        int sum = 0;
		         if((arr1.length-i-1)>= 0){
		        sum = sum + arr1[arr1.length-i-1];
		         } 
		         if(arr2.length-i-1 >= 0){
		        sum = sum + arr2[arr2.length-1-i];
		         }
		         
		         int newArr = sum +  arr[arr.length-1-i];
		        
		         if(newArr % 2 ==0){
		             arr[arr.length-1-i] =  0;
		             arr[arr.length-2-i] =  arr[arr.length-2-i]+ (newArr/2);
		            arr[arr.length-3-i] =  arr[arr.length-3-i] + (newArr/ 2);
		         }
		         else{
		              arr[arr.length-1-i] =  1;
		              arr[arr.length-2-i] =  arr[arr.length-2-i]+ (newArr/2);
			           arr[arr.length-3-i] =  arr[arr.length-3-i] +(newArr/2);
		         }
		     }
		    if(arr[1]%2 == 0) {
		    	 arr[0] =  arr[0]+ arr[1] /2;
		    	 arr[1] =  0;
	             arr[0] = arr[0]%2;
		     }
		     else if(arr[1]%2 !=0){
		    	 arr[0] = arr[0] + arr[1]/2;
		    	 arr[1] = 1;
		    	 arr[0] = arr[0] % 2;
		     }
		     for(int  i = 0;i<arr.length; i++) {
		    	 if(arr[i] == 1) {
		    		 return Arrays.copyOfRange(arr, i, arr.length);
		    	 }
		     }
		     return new int[]{0};
		    }
		
	}
