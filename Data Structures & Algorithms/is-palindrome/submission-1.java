class Solution {
    public boolean isPalindrome(String s) {
        String res="";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                res+=Character.toLowerCase(c);
            }
        }
        for(int i=0;i<res.length()/2;i++){
            if(res.charAt(i)!=res.charAt(res.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
