class Solution {

    public int findTheWinner(int N , int K){

        K = ((K > N) ? (K % N) : (K));
        
        Queue<Integer> queue = new LinkedList<Integer>();

        for(int number = 1 ; (number <= N) ; number++){
            queue.add(number);
        }

        while(queue.size() > 1){

            for(int number = 1 ; (number < K) ; number++){
                queue.add(queue.poll());
            }

            queue.poll();
        }

        return queue.poll();
    }
}
