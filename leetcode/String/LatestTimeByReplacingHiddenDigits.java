class Solution {
    public String maximumTime(String time) {
        StringBuilder sb = new StringBuilder(time);
        char zero = sb.charAt(0);
        char one = sb.charAt(1);
        char three = sb.charAt(3);
        char four = sb.charAt(4);
        if(zero == '?'){
            if(one < '4') sb.setCharAt(0, '2');
            else sb.setCharAt(0, '1');
        }
        if(one == '?'){
            if(zero == '0' || zero == '1') sb.setCharAt(1, '9');
            else sb.setCharAt(1, '3');
        }
        if(three == '?'){
            sb.setCharAt(3, '5');
        }
        if(four == '?'){
            sb.setCharAt(4, '9');
        }
        if(zero == '?' && one == '?'){
            sb.setCharAt(0, '2');
            sb.setCharAt(1, '3');
            if(three == '?') sb.setCharAt(3, '5');
            if(four == '?') sb.setCharAt(4, '9');
        }       
        return sb.toString();
    }
}
