 class Solution {
    public int[] separateDigits(int[] nums) {
        int[] ans = new int[6000];
        int c = 0;
        for(int x:nums){
            Stack<Integer> s = new Stack<>();
            for(int y = x; y > 0; y /= 10)s.push(y%10);
            while(!s.isEmpty())ans[c++] = s.pop();
        }
        return Arrays.copyOf(ans, c);
    }
}
