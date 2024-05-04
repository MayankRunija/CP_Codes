import java.util.List;

public class Solution {
    public long minSum(List<Integer> v1, List<Integer> v2) {
        long s1 = 0, s2 = 0;
        int c1 = 0, c2 = 0;
        int n = v1.size(), m = v2.size();
        for (int i : v1) {
            if (i == 0)
                c1++;
            s1 += i;
        }
        for (int i : v2) {
            if (i == 0)
                c2++;
            s2 += i;
        }
        s1 = s1 + c1;
        s2 = s2 + c2;
        if (s2 > s1) {
            long temp = s1;
            s1 = s2;
            s2 = temp;
            int tempCount = c1;
            c1 = c2;
            c2 = tempCount;
        }
        if (s1 != s2 && c1 == 0 && c2 == 0)
            return -1;
        if (s1 != s2 && c2 == 0)
            return -1;
        return s1;
    }
}
