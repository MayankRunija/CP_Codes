class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            String str = String.valueOf(num);
            char max = '0';
            for (char i : str.toCharArray()) {
                if (i > max) {
                    max = i;
                }
            }
            StringBuilder sb = new StringBuilder(str.length());
            for (int i = 0; i < str.length(); i++) {
                sb.append(max);
            }
            int digit = Integer.parseInt(sb.toString());
            sum += digit;
        }
        return sum;
    }
}
