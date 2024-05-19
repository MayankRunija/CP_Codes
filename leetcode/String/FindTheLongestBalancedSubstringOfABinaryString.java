class Solution {
    public int findTheLongestBalancedSubstring(String s) {
       int n = s.length(); 
       int len=0;
       
       for(int i=0;i<n;i++)
       {
           int count_zero=0;
           if(s.charAt(i)=='1')
           {
               int k=i-1;
               while(k>=0 && s.charAt(k)=='0')
               {
                   count_zero++;
                   k--;
               }
               int x=i;
              int count_one=0;
               while(x<n && s.charAt(x)=='1')
               {
                   count_one++;
                   x++;
               }
               len=Math.max(len,Math.min(count_zero,count_one)*2);
           }
       }
    return len;
    }
}
