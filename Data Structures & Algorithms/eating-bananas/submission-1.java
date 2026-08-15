class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int l=1,r=piles[piles.length-1];
        int res=r;
        while(l<=r){
            int m=(l+r)/2;
            int totaltime=0;
            for(int p:piles){
                totaltime+=Math.ceil((double)p/m);
            }
            if(totaltime<=h){
                res=m;
                r=m-1;
            }else{
                l=m+1;
            }
        } 
        return res;
    }
}
