class Solution {

    static int[] days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
    static {
        for (int i = 1; i < days.length; i++) days[i] += days[i - 1];
    }

    public int dayOfYear(String date) {
        String[] d = date.split("-");
        int year = Integer.parseInt(d[0]), month = Integer.parseInt(d[1]) - 1, day = Integer.parseInt(d[2]);
        return isLeapYear(year) && month > 1 ? days[month] + day + 1 : days[month] + day;
    }

    static boolean isLeapYear(long year) {
        return ((year & 3) == 0) && ((year % 100) != 0 || (year % 400) == 0);
    }
}
