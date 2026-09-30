class Solution {
    public int[] productExceptSelf(int[] nums) {
        int mulwithoutzero=1,cnt=0;
        int res[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                cnt++;
                continue;
            }else{
               
                mulwithoutzero=mulwithoutzero*nums[i];
            }  
        }
       
        for(int i=0;i<res.length;i++){
            if(cnt>1){
                res[i]=0;
            }else if(cnt==1){
                res[i]=(nums[i]==0) ? mulwithoutzero :0;
            }else{
                res[i]=mulwithoutzero/nums[i];
            }
        }
        return res;
    }
}  


