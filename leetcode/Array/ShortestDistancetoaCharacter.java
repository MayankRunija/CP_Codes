class Solution {
    public int[] shortestToChar(String str, char c) {
        StringBuilder s = new StringBuilder(str);

        int ans[] = new int[s.length()];

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==c){
                ans[i]=0;
                continue;
            }
            String s1 = s.substring(0,i);
            String s2 = s.substring(i+1);

            int a = s1.lastIndexOf(c);
            int b = s2.indexOf(c);

            if(a==-1) a = Integer.MAX_VALUE;
            else a = s1.length()-a;

            if(b==-1) b = Integer.MAX_VALUE;
            else b = b+1;


            ans[i] = Math.min(a,b);
        }

        return ans;
    }
}
