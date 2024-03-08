class Solution {
    public int minJumps(int[] arr) {

        int n=arr.length;
        Map<Integer,List<Integer>> valIndex=new HashMap<>();

        for(int i=0;i<n;i++)
            valIndex.computeIfAbsent(arr[i],l->new ArrayList<>()).add(i);

        Queue<Integer> q=new LinkedList<>();
        q.add(0);

        Set<Integer> visited=new HashSet<>();
        visited.add(0);

        int step=0;


        while(!q.isEmpty()){
            int size=q.size();
            while(size-->0){
                int i=q.poll();


                if(i==n-1)
                    return step;

                List<Integer> adjList=valIndex.get(arr[i]);

                adjList.add(i-1);
                adjList.add(i+1);

                for(int j:adjList)
                {
                    if(j>=0&& j<n && !visited.contains(j))
                        {
                            q.add(j);
                            visited.add(j);
                        }
                }
                adjList.clear();   
            }



            step++;
        }



      return -1;  
    }
}
