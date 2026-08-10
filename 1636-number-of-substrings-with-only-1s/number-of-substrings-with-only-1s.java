class Solution {
    public int numSub(String s) {
        long totalCount = 0;
        long currentStreak = 0;
        int MOD = 1_000_000_007;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                currentStreak++;
                totalCount = (totalCount + currentStreak) % MOD;
            } else {
                currentStreak = 0; // Reset streak when we hit a '0'
            }
        }

        return (int) totalCount;
    }
}