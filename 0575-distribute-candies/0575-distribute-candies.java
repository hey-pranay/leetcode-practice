class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();

        for (int candies : candyType) {
            set.add(candies);
        }

        return Math.min(set.size(), candyType.length / 2);
    }
}