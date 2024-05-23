class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Character,Integer>mp = new HashMap<>();
        for(int i=0;i<s.length();i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
            if(mp.get(s.charAt(i))>=2)
            return s.charAt(i);
        }
        return ' ';

    }
}
