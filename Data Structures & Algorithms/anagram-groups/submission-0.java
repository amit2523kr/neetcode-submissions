class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String,List<String>> mp = new HashMap<>();
        for(String s:strs){
         char[] c=s.toCharArray();
         Arrays.sort(c);
         String str=String.valueOf(c);
         if(!mp.containsKey(str)){
            mp.put(str,new ArrayList());
         }
            mp.get(str).add(s);
        }
        return new ArrayList(mp.values());
    }
}
