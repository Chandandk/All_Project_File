public class LCS {
    
    public static String findLCS(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m+1][n+1];
        
        // Fill the dp table
        for(int i=1; i<=m; i++) {
            for(int j=1; j<=n; j++) {
                if(s1.charAt(i-1) == s2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        
        // Retrieve the LCS
        int i = m, j = n;
        StringBuilder sb = new StringBuilder();
        while(i > 0 && j > 0) {
            if(s1.charAt(i-1) == s2.charAt(j-1)) {
                sb.append(s1.charAt(i-1));
                i--;
                j--;
            } else if(dp[i][j-1] > dp[i-1][j]) {
                j--;
            } else {
                i--;
            }
        }
        
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String s1 = "VIKASH";
        String s2 = "AKASHPH";
        String lcs = findLCS(s1, s2);
        System.out.println("Longest Common Subsequence: " + lcs); // Output: "ADH"
    }
}