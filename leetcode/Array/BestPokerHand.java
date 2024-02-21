class Solution{
    public String bestHand(int[] ranks, char[] suits){
        int[] arr = new int[14];
        for(int i=0; i<5; i++) arr[ranks[i]]++;
        int max = maxNum(arr);
        if(isFlush(suits)) return "Flush";
        else if(max>=3) return "Three of a Kind";
        else if(max>=2) return "Pair";
        else return "High Card";
        
    }

    public boolean isFlush(char[] suits){
        char a = suits[0];
        for(int i=1; i<suits.length; i++){
            if(suits[i]!=a) return false;
        }
        return true;
    }

    public int maxNum(int[] arr){
        int max = arr[0];
        for(int e:arr) max = Math.max(max, e);
        return max;
    }
}
