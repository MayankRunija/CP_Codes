class Solution {
    public boolean judgeCircle(String moves) {
        int up = 0;
        int down = 0;
        int left = 0;
        int right =0;
        for(char k:moves.toCharArray()){
            switch(k){
                case 'U': up++; break;
                case 'D': down++; break;
                case 'L': left++; break;
                case 'R': right++; break;
            }
        }
        return left==right && up==down;
        

    }
}
