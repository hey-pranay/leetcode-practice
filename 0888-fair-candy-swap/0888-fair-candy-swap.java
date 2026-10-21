class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0;
        int sumB = 0;

        for(int s : aliceSizes){
            sumA += s;
        }

        for(int s : bobSizes){
            sumB += s;
        }

        int diff = (sumA - sumB) / 2;

        HashSet<Integer> set = new HashSet<>();

        for(int y : bobSizes){
            set.add(y);
        }

        for(int x : aliceSizes ){

        
            int y = x - diff;
        if(set.contains(y)){
            return new int[]{x,y};
        }
        }

        return new int[]{};
    
    }
}