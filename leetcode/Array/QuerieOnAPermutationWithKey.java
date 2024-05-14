class Solution {
    public int[] processQueries(int[] queries, int m) {
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = i + 1;
        }
        
        for (int i = 0; i < queries.length; i++) {
            queries[i] = findIndex(arr, queries[i]);        
        }   
        return queries;
    }
    
    private int findIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                updateIndexing(arr, i, target);
                return i;
            }
        }
        return 0;
    } 

    private void updateIndexing(int[] arr, int i, int target) {
        for (int j = i; j > 0; j--) {
            arr[j] = arr[j-1];
        }
        arr[0] = target;
    }
}

