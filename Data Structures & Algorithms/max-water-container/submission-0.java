class Solution {
    public int maxArea(int[] heights) {
        int left=0;
        int right=heights.length-1;
        int maxArea=Integer.MIN_VALUE;
        while(left<right){
            int min=Math.min(heights[left],heights[right]);
            int dist=right-left;
            maxArea=Math.max(min*dist,maxArea);
            if(heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
}
