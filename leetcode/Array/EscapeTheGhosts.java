class Solution {
    static double distance(int arr1[], int arr2[]){
        int x1 = arr1[0];
        int y1 = arr1[1];

        int x2 = arr2[0];
        int y2 = arr2[1];

        return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
    }

    public boolean escapeGhosts(int[][] ghosts, int[] tar) {

        double d1 = Math.abs(tar[0])+Math.abs(tar[1]);

        double d2 = Double.MAX_VALUE;

        for(int i=0; i<ghosts.length; i++){
            int a = Math.abs(ghosts[i][0]-tar[0])+Math.abs(ghosts[i][1]-tar[1]);
            d2 = Math.min(a,d2);
        }

        if(d1<d2) return true;
        return false;
    }
}
