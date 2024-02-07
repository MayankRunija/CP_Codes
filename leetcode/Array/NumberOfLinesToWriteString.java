class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int[] arr = new int[2];
        int x = 1;
        int sum = 0;
        for(char c : s.toCharArray()){
            int char_width = widths[c - 'a'];
            if(char_width + sum > 100){
                x++;
                sum = 0;
            }
            sum += char_width;            
        }
        arr[0] = x;
        arr[1] = sum;
        return arr;
    }
}
