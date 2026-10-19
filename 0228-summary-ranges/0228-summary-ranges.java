class Solution {
    public List<String> summaryRanges(int[] nums) {
        int n = nums.length;

        List<String> result = new ArrayList<>();

        for(int i=0;i<n;i++){
            int start = nums[i];
            while(i+1 < n && nums[i+1] - nums[i] == 1){
                   i++; 
            }
            StringBuilder sb = new StringBuilder();
            sb.append(start);
            if(start != nums[i]){
                // result.add(start + "->" + nums[i]);
                sb.append("->").append(nums[i]);
            } 
                result.add(sb.toString());
            
        }
        return result;
    }
}