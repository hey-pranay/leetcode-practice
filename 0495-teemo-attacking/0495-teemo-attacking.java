class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {

        int n = timeSeries.length;

        int seconds = 0;

        for (int i = 0; i < n - 1; i++) {
            int gap = timeSeries[i + 1] - timeSeries[i];

            seconds += Math.min(gap, duration);
        }

        if (n > 0) {
            seconds += duration;
        }

        return seconds;
    }
}