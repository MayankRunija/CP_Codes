class Solution {
    public int countSeniors(String[] details) {
        int n,c=0;
        for (n=0;n<details.length;n++){
            int i=Integer.parseInt(details[n].substring(11,13));
            if(i>60) {
                 c++;
            }
        }
        return c;
    }
}
