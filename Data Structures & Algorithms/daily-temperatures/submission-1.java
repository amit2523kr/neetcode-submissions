class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int res[] = new int[n];

        for (int i = 0; i < n; i++) {
            int cnt = 0;

            for (int j = i + 1; j < n; j++) {
                cnt++;

                if (temperatures[j] > temperatures[i]) {
                    res[i] = cnt;
                    break;
                }
                if (j == n - 1) {
                    res[i] = 0;
                }
            }
        }

        return res;
    }
}