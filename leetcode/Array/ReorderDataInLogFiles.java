class Solution {
       public String[] reorderLogFiles(String[] logs) {
        PriorityQueue<letterLog> letterLogs = new PriorityQueue<>((a,b) -> a.compareTo(b));
        ArrayList<String> digitLogs = new ArrayList<>();
        for(String s : logs) {
            int index = s.indexOf(" ");
            if(s.charAt(index+1) < 'a') {
                digitLogs.add(s);
            } else {
                letterLogs.add(new letterLog(s));
            }
        }
        String[] arr = new String[logs.length];
        int i = 0;
        while(!letterLogs.isEmpty()) {
            arr[i] = letterLogs.poll().full;
            i++;
        }
        for(String s : digitLogs) {
            arr[i] = s;
            i++;
        }
        return arr;
    }
    public class letterLog implements Comparable<letterLog> {
        public String content;
        public String log;
        public String full;
        public letterLog(String input) {
            full = input;
            content = input.substring(input.indexOf(" "));
            log = input.substring(0, input.indexOf(" "));
        }
        @Override
        public int compareTo(letterLog input) {
            if(content.compareTo(input.content) == 0) {
                return log.compareTo(input.log);
            } else {
                return content.compareTo(input.content);
            }
        }
    }

}
