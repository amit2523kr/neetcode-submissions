class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int ans[]=new int[2];
        HashMap<Integer,Integer> mp = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
                int complement = target - numbers[i];
                if (mp.containsKey(complement)) {
                    ans[0] = mp.get(complement) + 1;
                    ans[1] = i + 1;
                    break;
                } else {
                    mp.put(numbers[i], i);
                }
            }
        return ans;
    }
}
