class Solution {
    public boolean isFreqSame(int freq1[], int freq2[]) {
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean checkInclusion(String s1, String s2) {
        int freq1[] = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            freq1[s1.charAt(i) - 'a']++;
        }

        int windowSize = s1.length();

        for (int i = 0; i <= s2.length() - windowSize; i++) {
            int windFreq[] = new int[26];

            for (int j = 0; j < windowSize; j++) {
                windFreq[s2.charAt(i + j) - 'a']++;
            }

            if (isFreqSame(freq1, windFreq)) {
                return true;
            }
        }

        return false;
    }
}