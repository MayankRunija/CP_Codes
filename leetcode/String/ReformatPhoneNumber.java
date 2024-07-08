class Solution {
    public String reformatNumber(String number) {
        StringBuilder sb=new StringBuilder();
        for(char c: number.toCharArray()) {
            if(c>='0' && c<='9')  sb.append(c);
        }
        StringBuilder ans=new StringBuilder();
        String s=sb.toString();
        boolean flag=false;
        for(int i=0;i<s.length();){
            if(s.length()-i==4){
                if(flag) ans.append("-");
                ans.append(s.substring(i,i+2));
                ans.append("-");
                ans.append(s.substring(i+2,i+4));
                flag=true;
                break;
            }
            else if(s.length()-i==2){
                if(flag) ans.append("-");
                ans.append(s.substring(i,i+2));
                flag=true;
                break;
            }
            else{
                if(flag) ans.append("-");
                ans.append(s.substring(i,i+3));
                flag=true;
                i+=3;
            }
        }
        return ans.toString();
    }
}
