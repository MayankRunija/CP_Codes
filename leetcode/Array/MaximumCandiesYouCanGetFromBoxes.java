class Solution {
    public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
        int n= status.length;
        boolean []visited= new boolean[n];
        Queue<Integer> boxesList= new LinkedList<>();

        for(int box: initialBoxes){
            if(status[box] == 1){
                boxesList.add(box);
                visited[box]= true;
            }else{
                status[box]= 2;
            }
        }
        int nCandies= 0;
        while(!boxesList.isEmpty()){
            int box= boxesList.remove();
            nCandies+= candies[box];
            for(int boxNo: containedBoxes[box]){
                if(visited[boxNo]){
                    continue;
                }
                if(status[boxNo]==1){
                    boxesList.add(boxNo);
                    visited[boxNo]= true;
                }else{
                    status[boxNo]= 2;
                }
            }

            for(int key: keys[box]){
                if(visited[key]){
                    continue;
                }
                if(status[key]== 2){
                    boxesList.add(key);
                    visited[key]= true;
                }else{
                    status[key]= 1;
                }
            }
        }
        return nCandies;
    }
}
