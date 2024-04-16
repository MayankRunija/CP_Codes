class Solution {
    int getNearestDryDay(List<Integer> dryDays, int targetDay) //returns the nearest dry day after targetDay
    {
        int low = 0, high = dryDays.size() - 1;
        int ans = -1, index = -1;
        while(low <= high)
        {
            int mid = low + (high - low) / 2;
            int currDay = dryDays.get(mid);
            if (currDay > targetDay) { index = mid; ans = currDay; high = mid - 1; }
            else low = mid + 1;
        }
        if (index != -1) dryDays.remove(index);
        return ans;
    }
    public int[] avoidFlood(int[] rains) 
    {
        HashMap<Integer, Integer>fullMap = new HashMap(); //{lakeIdx : day} 
        int n = rains.length;
        int[] ans = new int[n];
        Arrays.fill(ans, 1);
        //=========================================================
        List<Integer>dryDays = new ArrayList();
        for (int i = 0; i < n; i++) //i denotes the ith day
        {
            int lakeIdx = rains[i]; 
            if (lakeIdx == 0) { dryDays.add(i); continue; }  //no rain over any lake
            
            if (fullMap.containsKey(lakeIdx)) //if current lake is already full
            {
                int lastDrenchedDay = fullMap.get(lakeIdx); //day when "lakeIdx"th lake was last drenched
                int nearestDryDay = getNearestDryDay(dryDays, lastDrenchedDay);
                
                if (nearestDryDay == -1) return new int[]{};
                ans[nearestDryDay] = lakeIdx;
            }
            fullMap.put(lakeIdx, i);
            ans[i] = -1;
        }
        //===========================================================
        return ans;
    }
}
