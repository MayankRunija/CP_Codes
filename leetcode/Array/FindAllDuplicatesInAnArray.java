class Solution {
    public List<Integer> findDuplicates(int[] nums) 
    {
        List<Integer> result=new ArrayList<Integer>();
        int count[]=new int[nums.length+1];
        for(int i:nums)
        count[i]++;
        for(int i=1;i<=nums.length;i++)
        {
            if(count[i]==2)
            result.add(i);
        }
        return result;
    }
}
