class Solution {
    public long elevatorRequests(int n, int start, int[][] requests) {
        Map<Integer, Integer> m= new HashMap<>();
        for(int[] r : requests) m.merge(r[1], r[0], Math::max);

        int k = m.size();
        if(k == 0) return 0;

        int[] floor = new int[k], arr = new int[k];
        int idx = 0;
        for(var e : m.entrySet()) { floor[idx]= e.getKey(); arr[idx] = e.getValue(); idx++; }

        int full = 1<<k;
        long INF = Long.MAX_VALUE /2;
        long[][] dp = new long[full][k];
        for(long[] row : dp) Arrays.fill(row, INF);

        for(int i = 0; i<k; i++)
            dp[1 << i][i] = Math.max((long) arr[i], Math.abs((long) start - floor[i]));

        for(int mask = 1; mask<full; mask++)
            for(int i = 0; i<k; i++){
                if((mask & (1 << i)) == 0 || dp[mask][i] >= INF) continue;
                for(int j = 0; j<k; j++){
                    if((mask & (1 << j)) != 0) continue;
                    long nt = Math.max(dp[mask][i] + Math.abs((long)floor[i] - floor[j]),(long) arr[j]);
                    int nm = mask | (1 << j);
                    if(nt <dp[nm][j]) dp[nm][j] = nt;
                }
            }
        long ans = INF;
        for(int i = 0; i<k; i++) ans = Math.min(ans, dp[full - 1][i]);
        return (int) ans;
    }
}
