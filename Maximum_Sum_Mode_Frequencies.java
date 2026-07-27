import java.util.*;
public class Maximum_Sum_Mode_Frequencies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int[][] score = new int[n][n];
        for (int i = 0; i < n; i++) {
            HashMap<Integer, Integer> freq = new HashMap<>();
            int maxFreq = 0;
            for (int j = i; j < n; j++) {

                freq.put(arr[j], freq.getOrDefault(arr[j], 0) + 1);
                maxFreq = Math.max(maxFreq, freq.get(arr[j]));

                score[i][j] = maxFreq;
            }
        }
        int[][] dp = new int[k + 1][n + 1];
        for (int i = 0; i <= k; i++)
            Arrays.fill(dp[i], Integer.MIN_VALUE);
        dp[0][0] = 0;
        for (int g = 1; g <= k; g++) {
            for (int i = g; i <= n; i++) {
                for (int p = g - 1; p < i; p++) {
                    if (dp[g - 1][p] != Integer.MIN_VALUE) {
                        dp[g][i] = Math.max(
                                dp[g][i],
                                dp[g - 1][p] + score[p][i - 1]
                        );
                    }
                }
            }
        }
        System.out.println(dp[k][n]);
        sc.close();
    }
}

// case1: 
// Sample Input
// 7
// 2
// 1
// 2
// 2
// 3
// 1
// 1
// 1
// Sample Output
// 5