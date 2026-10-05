class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();

        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            mp.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                int sum = nums[i] + nums[j];
                int target = -sum;

                if (mp.containsKey(target)) {
                    int k = mp.get(target);

                    if (k != i && k != j) {
                        List<Integer> triplet = new ArrayList<>();

                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(target);

                        Collections.sort(triplet);

                        set.add(triplet);
                    }
                }
            }
        }

        res.addAll(set);
        return res;
    }
}