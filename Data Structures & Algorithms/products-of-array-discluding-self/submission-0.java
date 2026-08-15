class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        
        int zeroCount = 0;
        int total = 1;

        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            } else {
                total *= num;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (zeroCount > 1) {
                ans[i] = 0;
            } else if (zeroCount == 1) {
                ans[i] = (nums[i] == 0) ? total : 0;
            } else {
                ans[i] = total / nums[i];
            }
        }

        return ans;
    }
}