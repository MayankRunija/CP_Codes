class Solution {
    public boolean isPrefixString(String s, String[] words) {
        int count = 0;
        for(int i = 0; i<words.length;i++){
         if((s.length()-count)<words[i].length())return false;
            for(int j = 0 ;j<words[i].length();j++){
                if(s.charAt(count++)!=words[i].charAt(j))return false;
                if(count==s.length()) return true;
            }
        }
        return false;
    }
}
