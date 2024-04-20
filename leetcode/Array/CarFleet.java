class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = speed.length;
        List<Pair<Integer, Integer>> v = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            v.add(new Pair<>(position[i], speed[i]));
        }

        Collections.sort(v, (a, b) -> a.getKey() - b.getKey());

        List<Float> time = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            time.add((float) (target - v.get(i).getKey()) / v.get(i).getValue());
        }

        float curr = Float.NEGATIVE_INFINITY;
        int res = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (time.get(i) > curr) {
                curr = time.get(i);
                res++;
            }
        }

        return res;
    }
}
