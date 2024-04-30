class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        
        for(int i=1;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                String ch1=String.valueOf(words[i-1].charAt(j));
                String ch2=String.valueOf(words[i].charAt(j));
                if(order.indexOf(ch1)>order.indexOf(ch2)){
                      return false;
                }else if(order.indexOf(ch1)<order.indexOf(ch2)){
                            break;
 // we need to examine the case when words are like ("apple", "app").
                }else if(words[i].length()<words[i-1].length()){
                    if(j==words[i].length()-1){
                            return false;
                    }
 // we need to examine the case when words are like ("app", "apple").
                }else if(words[i].length()>words[i-1].length()){
                    if(j==words[i-1].length()-1){
                            break;
                    }
                }
            }
        }
    return true;    
    }
}
