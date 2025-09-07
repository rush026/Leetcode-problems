class Solution {
    public int countPalindromes(String s) {
        int n = s.length(), MOD = 1000000007;
        long[][] leftPairs = new long[10][10];
        long[][] rightPairs = new long[10][10];
        int[] leftCount = new int[10];
        int[] rightCount = new int[10];
        int[] freq = new int[10];
        for (int i = 0; i < n; i++) {
            int cur = s.charAt(i) - '0';
            for (int d = 0; d < 10; d++) rightPairs[d][cur] += freq[d];
            freq[cur]++;
        }
        for (int d = 0; d < 10; d++) rightCount[d] = freq[d];
        long ans = 0;
        for (int mid = 0; mid < n; mid++) {
            if (mid > 0) {
                int idx = mid - 1;
                int x = s.charAt(idx) - '0';
                for (int a = 0; a < 10; a++) leftPairs[a][x] += leftCount[a];
                leftCount[x]++;
            }
            int xm = s.charAt(mid) - '0';
            for (int d = 0; d < 10; d++) {
                int after = rightCount[d] - (d == xm ? 1 : 0);
                rightPairs[xm][d] -= after;
            }
            rightCount[xm]--;
            if (mid >= 2 && mid + 2 < n) {
                for (int a = 0; a < 10; a++)
                    for (int b = 0; b < 10; b++)
                        ans = (ans + (leftPairs[a][b] * rightPairs[b][a]) % MOD) % MOD;
            }
        }
        return (int) ans;
    }
}
