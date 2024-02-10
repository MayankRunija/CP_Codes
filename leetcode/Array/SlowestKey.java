class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int a[] = new int[releaseTimes.length];
        char ch=' ';
        int d=0, max=Integer.MIN_VALUE;

        for(int i=0;i<releaseTimes.length;i++)
        {
            if(i>0)
            {
                d=releaseTimes[i]-releaseTimes[i-1];
            }
            else{
                d=releaseTimes[0];
            }
            a[i]=d;
        }

        for(int i=0;i<releaseTimes.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
                ch=keysPressed.charAt(i);
            }
            else if(a[i]==max)
            {
                if(ch < keysPressed.charAt(i))
                {
                    ch=keysPressed.charAt(i);
                }
            }
        }
        return ch;
    }
}
