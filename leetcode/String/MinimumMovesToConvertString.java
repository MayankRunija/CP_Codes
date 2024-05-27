class Solution {
    public int minimumMoves(String s) {
        char[] ch=s.toCharArray();
        int ctr=0;
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='X')
            {
                i+=2;
                ctr++;
            }
        }
        return ctr;
    }
}
