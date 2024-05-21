class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        int i = s.length()-1;
        int hashCount = 0;
        while (i>=0) {
            if (s.charAt(i)=='#') {
                hashCount++;
            }
            else if (hashCount!=0) {
                hashCount--;
            }
            else {
                s1.insert(0,s.charAt(i));
            }
            i--;
        }
        i=t.length()-1;
        hashCount=0;
        while (i>=0) {
            if (t.charAt(i)=='#') {
                hashCount++;
            }
            else if (hashCount!=0) {
                hashCount--;
            }
            else {
                s2.insert(0,t.charAt(i));
            }
            i--;
        }
        if ((s1.toString()).equals(s2.toString())) {
            return true;
        }
        return false;
    }
}
