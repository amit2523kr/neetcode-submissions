class Solution {
    private boolean compareMap(int smap[], int tmap[]) {
        for (int i = 0; i < 256; i++) {
            if (tmap[i] > smap[i]) {
                return false;
            }
        }
        return true;
    }

    public String minWindow(String s, String t) {
        int smap[] = new int[256];
        int tmap[] = new int[256];

        for (char c : t.toCharArray()) {
            tmap[c]++;
        }

        int left = 0, right = 0;
        int minLen = Integer.MAX_VALUE, minStart = 0;

        for (; right < s.length(); right++) {
            smap[s.charAt(right)]++;

            while (compareMap(smap, tmap)) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    minStart = left;
                }
                smap[s.charAt(left)]--;
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}