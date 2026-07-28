import java.util.Scanner;

public class Longest_Common_Subsequence_K_Replacements {

    public static int solve(String s, String t, int k) {
        int n = s.length();
        int m = t.length();
        int[][][] dp = new int[n + 1][m + 1][k + 1];
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                for (int r = 0; r <= k; r++) {
                    dp[i][j][r] = Math.max(dp[i + 1][j][r], dp[i][j + 1][r]);
                    if (s.charAt(i) == t.charAt(j)) {
                        dp[i][j][r] = Math.max(dp[i][j][r],
                                1 + dp[i + 1][j + 1][r]);
                    }
                    else if (r > 0) {
                        dp[i][j][r] = Math.max(dp[i][j][r],
                                1 + dp[i + 1][j + 1][r - 1]);
                    }
                }
            }
        }
        return dp[0][0][k];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        int k = sc.nextInt();
        int ans = solve(s, t, k);
        System.out.println(ans);
        sc.close();
    }
}