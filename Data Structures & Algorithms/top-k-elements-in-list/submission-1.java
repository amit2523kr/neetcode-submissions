class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int ans[]= new int[k];
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        List<int[]> arr = new ArrayList<>();
        for(Map.Entry<Integer, Integer> ele : mp.entrySet()){
            arr.add(new int[]{ele.getValue(),ele.getKey()});
        }
        arr.sort((a,b)->b[0]-a[0]);
        for(int i=0;i<k;i++){
            ans[i]=arr.get(i)[1];
        }
        return ans;
    }
}
