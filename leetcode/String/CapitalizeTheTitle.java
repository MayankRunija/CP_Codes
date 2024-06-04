class Solution {
    public String capitalizeTitle(String title) {
        if(title.length()<3){
            return title.toLowerCase();
        }
      char[] ch=title.toCharArray();
      if(ch.length>2 && !Character.isWhitespace(ch[1]) && !Character.isWhitespace(ch[2]) && ch[0]>='a'&& ch[0]<='z'){
        ch[0]-=32;

      }
      else if(ch[0]>='A'&& ch[0]<='Z' && (Character.isWhitespace(ch[1]) || Character.isWhitespace(ch[2]))){
        ch[0]+=32;
      }
      for(int i=1;i<ch.length;i++){
        if(Character.isWhitespace(ch[i-1]) && i<ch.length-2 && !Character.isWhitespace(ch[i+1]) && !Character.isWhitespace(ch[i+2])){
            if(ch[i]>='a'&& ch[i]<='z'){
                ch[i]-=32;
            }

        }
        else{
            if(ch[i]>='A'&& ch[i]<='Z'){
                ch[i]+=32;
            }
        }
      } 
      return new String(ch); 
    }
}
