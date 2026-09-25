class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      HashMap<String,List<String>> mp = new HashMap<>();
      for(String s:strs){
        char ch[]=s.toCharArray();
        Arrays.sort(ch);
        String p= String.valueOf(ch);
        if(!mp.containsKey(p)){
            mp.put(p,new ArrayList());
        }
        mp.get(p).add(s);
      }
      return new ArrayList(mp.values());
    }
}
