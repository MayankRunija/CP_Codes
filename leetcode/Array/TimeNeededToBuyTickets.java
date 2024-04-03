class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new ArrayDeque<>();
        int size = tickets.length, counter = 0;
        boolean flag = true;
        for(int i = 0;i < tickets.length;i++)
            q.add(tickets[i]);
        while(flag){
            for(int i = 0;i < size && !q.isEmpty();i++){
                int temp = q.remove() - 1;
                if(i == k && temp == 0){
                    flag = false;
                    counter++;
                    break;
                }
                q.add(temp);
                if(temp >= 0) counter++;
            }
        }
        return counter;
    }
}
