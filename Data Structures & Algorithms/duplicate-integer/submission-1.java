class Solution {
    public boolean hasDuplicate(int[] nums) {
       HashMap<Integer,Integer> mp = new HashMap<>();
       for(int i=0;i<nums.length;i++){
        mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
       }
       for(Map.Entry<Integer,Integer> ele : mp.entrySet()){
        if(ele.getValue()>1){
            System.out.println(ele.getValue());
            return true;
        }
       }
       return false;
    }
}