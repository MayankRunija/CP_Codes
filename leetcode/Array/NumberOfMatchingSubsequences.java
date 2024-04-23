class Solution {

    // Brute force - Checking each subsequence

/*    static boolean check(String s, String word){
        int prev = 0;

        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            int idx = s.indexOf(ch,prev);  // checking the char from prev;

            if(idx==-1) return false;
            else prev = idx+1;
        }
        return true;
    }

    static int helper(String s, String[] word){
        int ans = 0;

        for(int i=0; i<word.length; i++){
            if(check(s,word[i])) ans++;
        }

        return ans;
    }

    */
    public int numMatchingSubseq(String s, String[] word) {

        HashMap<String,Integer> hp = new HashMap<>();

        for(var a : word){
            hp.put(a,hp.getOrDefault(a,0)+1);
        }

        int ans = 0;    

        for(var a : hp.keySet()){
            int i=0;
            int j=0;

            while(i<s.length() && j<a.length()){
                if(s.charAt(i)==a.charAt(j)){
                    i++;
                    j++;
                }else{
                    i++;
                }
            }

            if(j==a.length()) ans+=hp.get(a);

        }
        return ans;
    }
}
