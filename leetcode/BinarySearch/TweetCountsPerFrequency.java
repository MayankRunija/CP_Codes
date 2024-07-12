
class TweetCounts {
    private final Map<String, TreeMap<Integer, Integer>> tweets;

    public TweetCounts() {
        this.tweets = new HashMap<>();
    }

    public void recordTweet(final String tweetName, final int time) {
        this.tweets.putIfAbsent(tweetName, new TreeMap<>());

        final TreeMap<Integer, Integer> tweet = this.tweets.get(tweetName);

        tweet.put(time, tweet.getOrDefault(time, 0) + 1);
    }

    public List<Integer> getTweetCountsPerFrequency(final String freq, final String tweetName, final int startTime, final int endTime) {
        final List<Integer> countsPerFrequency = new ArrayList<>();

        final TreeMap<Integer, Integer> tweet = this.tweets.get(tweetName);

        if (tweet == null) {
            return countsPerFrequency;
        }

        int interval = getInterval(freq);

        List<Integer> timestamps = new ArrayList<>(tweet.subMap(startTime, true, endTime, true).keySet());
        int index = 0;

        for (int i = startTime; i <= endTime; i += interval) {
            int currEndTime = Math.min(i + interval - 1, endTime);
            int count = 0;

            while (index < timestamps.size() && timestamps.get(index) <= currEndTime) {
                count += tweet.get(timestamps.get(index));
                index++;
            }

            countsPerFrequency.add(count);
        }

        return countsPerFrequency;
    }

    private int getInterval(final String freq) {
        switch (freq) {
            case "minute":
                return 60;
            case "hour":
                return 3600;
            case "day":
                return 86400;
            default:
                return -1;
        }
    }
}
