class Solution {
    public boolean isSelfCrossing(int[] distance) {
        for (int i = 3; i < distance.length; i++) {
            // Case 1: Fourth segment crosses first segment or later
            /**
             *  _____
             * |     |
             * |_____|___ <- Fourth segment crosses first segment or later
             *       |
             */
            if (i >= 3 && distance[i] >= distance[i - 2] && distance[i - 1] <= distance[i - 3]) {
                return true;
            }

            // Case 2: Fifth segment meets first segment, forming a cross
            /**
             *  _____
             * |     |
             * |     ||<- Fifth segment meets first segment
             * |     ||
             * |_____||
             */
            if (i >= 4 && distance[i - 1] == distance[i - 3] && distance[i] + distance[i - 4] >= distance[i - 2]) {
                return true;
            }

            // Case 3: Sixth or later segment meets or crosses third segment
            /**
             *  _____
             * |     |
             * |  ___|____ <- Sixth segment meets or crosses third segment
             * |     |    |
             * |__________|  
             */
            if (i >= 5 && distance[i - 2] >= distance[i - 4] && distance[i - 5] + distance[i - 1] >= distance[i - 3]
                    && distance[i - 1] <= distance[i - 3] && distance[i - 4] + distance[i] >= distance[i - 2]) {
                return true;
            }
        }

        return false;
    }
}
