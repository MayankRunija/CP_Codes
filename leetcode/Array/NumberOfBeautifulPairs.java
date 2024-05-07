class Solution {
    public int countBeautifulPairs(int[] nums) {
        int[] L = new int[10];
        L[nums[nums.length - 1] % 10]++;
        int count = 0;
        for (int i = nums.length - 2; i >= 0; i--) {
            int first = nums[i];
            if (first > 9)  first /= ((first <= 99) ? 10 : ((first > 999) ? 1000 : 100));
            switch (first) {
                case 1: count += L[1] + L[2] + L[3] + L[4] + L[5] + L[6] + L[7] + L[8] + L[9];  break;
                case 2: count += L[1] +        L[3] +        L[5]        + L[7] +        L[9];  break;
                case 3: count += L[1] + L[2] +        L[4] + L[5] +        L[7] + L[8]       ;  break;
                case 4: count += L[1] +        L[3] +        L[5] +        L[7] +        L[9];  break;
                case 5: count += L[1] + L[2] + L[3] + L[4] +        L[6] + L[7] + L[8] + L[9];  break;
                case 6: count += L[1] +                      L[5] +        L[7]              ;  break;
                case 7: count += L[1] + L[2] + L[3] + L[4] + L[5] + L[6] +        L[8] + L[9];  break;
                case 8: count += L[1] +        L[3] +        L[5] +        L[7] +        L[9];  break;
                case 9: count += L[1] + L[2] +        L[4] + L[5] +        L[7] + L[8]       ;  break;
            }
            L[nums[i] % 10]++;
        }
        return count;
    }
}
