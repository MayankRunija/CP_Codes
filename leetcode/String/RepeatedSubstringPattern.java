class Solution {

    public boolean check(String c, String s, int ind){
        int cn = c.length(), sn = s.length();
        if(sn%cn!= 0 )
            return false;
        int i = 0 , j = 0 ;
        for( i = ind ; i < sn ; i++){
            char cc = c.charAt(j % cn);
            char cs = s.charAt(i % sn);
            if(cc != cs)
            return false;
            j++;
        }
        return true;
    }

    public boolean repeatedSubstringPattern(String s) {
        int i = 0;
        String c = "";
        for( i = 0 ; i < s.length()/2 ; i++){
            char cc = s.charAt(i);
            c+=cc;
            boolean comp = check(c,s,i+1);
            if(comp)
            return true;
        }

        return false;
    }
}


/*


"abab"
"abcabcabcabc"
"abcabcabcabca"
"a"
*/
