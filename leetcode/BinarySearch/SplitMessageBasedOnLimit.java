class Solution {
    private int getPages(int l, int limit) {
        int curLen = limit - 5; // length of "<1/3>" is 5
        int curCapacity = 9;
        int extraSpace = 0;
        while (l > curLen * curCapacity + extraSpace) {
            curLen -= 2;
            extraSpace += curCapacity; // "***<5/23>" has extra space than "**<12/23>"
            curCapacity = Integer.parseInt(curCapacity + "9");
            if (curLen <= 0) return 0;
        }
        int ans = (l - extraSpace) / curLen;
        if ((l - extraSpace) % curLen != 0) ++ans;
        return ans;
    }

    public String[] splitMessage(String message, int limit) {
        int l = message.length();
        int pages = getPages(l, limit);
        String[] ans = new String[pages];
        int curPos = 0;
        for (int i=0; i<pages; ++i) {
            String tag = "<" + (i+1) + "/" + pages + ">";
            int infoLen = limit - tag.length();
            ans[i] = message.substring(curPos, Math.min(l, curPos + infoLen)) + tag;
            curPos += infoLen;
        }
        return ans;
    }
}
