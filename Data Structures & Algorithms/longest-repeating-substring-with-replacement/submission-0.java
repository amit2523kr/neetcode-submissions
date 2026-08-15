class Solution {
    public int characterReplacement(String s, int k) {
        int freq[]=new int[26];
        int left=0;
        int maxWindowsize=0;
        int maxFreq=0;
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'A']++;
            maxFreq=Math.max(maxFreq,freq[s.charAt(i)-'A']);
            int windowLength=i-left+1;
            if((windowLength-maxFreq)>k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            windowLength=i-left+1;
            maxWindowsize=Math.max(maxWindowsize,windowLength);
        }
        return maxWindowsize;
    }
}
