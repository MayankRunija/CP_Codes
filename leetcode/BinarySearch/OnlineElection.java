class TopVotedCandidate {
   
   HashMap<Integer, Integer> map = new HashMap<>();
    // declaring global arrays for the persons and times array
    int [] person;
    int [] time;
    // stores the winner at any point of time
    int [] winners;
    public TopVotedCandidate(int[] persons, int[] times) {
        person = persons;
        time = times;
        winners=  new int[time.length];
        // map stores the person which comes at time t and his vote number is updated in the map
        map.put(person[0],1);
        // max is continously checking who the max is eg.like when 1 comes after zero the max is updated to 1 when the values
        // for both 0 and 1 is same and 1 is more recent, if we get a bigger value then we update or else max remains same 
        // for that time
        int max = person[0];
        winners[0]=max;
        for(int i=1;i<person.length;i++)
        {
            //updating in the map
            map.put(person[i],map.getOrDefault(person[i],0)+1); 
            // update the max if the condition fulfills
            if(map.get(person[i])>=map.get(max)) 
            {
                max = person[i];   
            }
            // if value(votes) of the current person is greater then winner will be him, so the max would have gotten updated,
            // else winner[i] is same as winner[i-1]
             winners[i]=max;
        }
     
    }
    
    public int q(int t) {
        int low = -1;
        int high =time.length;
        // binary search to find the lower bound like for time 12, 10 is the lower bound so we check the max votes at time 10.
        while(low+1<high)
        {
            int mid = low + (high - low)/2;
            //if(time[mid]== t)
                //return winners[mid];
            if(time[mid]<=t)
                low= mid;
            else
                high = mid;
        }
        
        return winners[low];
    }
}
