class Solution {
    public int countLatticePoints(int[][] circles) {
        Map<Integer, Set<Integer>> map = new HashMap<>();
        int count = 0;
        for (int[] circle: circles){
            int x = circle[0];
            int y = circle[1];
            int r = circle[2];
            int leftX = x - r;
            int leftY = r - y;
            int rightX = x + r;
            int rightY = r + y;
            
            for (int i = leftX; i <= rightX;i++){
                for (int j= leftY;j <= rightY;j++){
                    if (inCircle(i, j, circle)) {
                        if (!map.containsKey(i)) map.put(i, new HashSet<>());
                        if (!map.get(i).contains(j)){
                            count++;
                            map.get(i).add(j);
                        }
                    }
                }
            }
        }

        return count;
        
    }
    
    public boolean inCircle(int x, int y, int[] circle){
        int xCenter = circle[0];
        int yCenter = circle[1];
        int r = circle[2];
        
        return dist((double)x,(double) y,(double) xCenter,(double) yCenter) <= r * r;
    }
    
    public double dist(double x1, double y1, double x2, double y2){
        return (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
    }
}
