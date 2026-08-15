class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int length=0;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int num:set){
            if(!set.contains(num-1)){
                int count=1;
                while(set.contains(num+count)){
                    count++;
                }
                length=Math.max(length,count);
            }
        }
        return length;
    }
}
