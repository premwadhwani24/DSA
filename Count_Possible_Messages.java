import java.util.*;

public class Count_Possible_Messages {
    static final int MOD = 1000000007;

    static long countWaysForRun(int len, int maxPress) {
        long[] dp = new long[len + 1];
        dp[0] = 1;

        for (int i = 1; i <= len; i++) {
            long ways = 0;
            for (int j = 1; j <= maxPress && j <= i; j++) {
                ways += dp[i - j];
            }
            dp[i] = ways % MOD;
        }
        return dp[len];
    }

    static long countPossibleMessages(String pressedKeys) {
        long ans = 1;
        int i = 0;

        while (i < pressedKeys.length()) {
            char ch = pressedKeys.charAt(i);
            int len = 0;
            while (i < pressedKeys.length() && pressedKeys.charAt(i) == ch) {
                len++;
                i++;
            }

            int maxPress = (ch == '7' || ch == '9') ? 4 : 3;
            ans = (ans * countWaysForRun(len, maxPress)) % MOD;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pressedKeys = sc.next();
        System.out.println(countPossibleMessages(pressedKeys));
        sc.close();
    }
}

// case1: 
// input =22233
// o/p= 8













// import java.util.*;
// public class Count_Possible_Messages {
//     static final int MOD = 1000000007;
//     static long countWays(int len, int maxPress) {
//         long[] dp = new long[len + 1];
//         dp[0] = 1;
//         for (int i = 1; i <= len; i++) {
//             for (int j = 1; j <= maxPress && j <= i; j++) {
//                 dp[i] = (dp[i] + dp[i - j]) % MOD;
//             }
//         }
//         return dp[len];
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.next();
//         long ans = 1;
//         int i = 0;
//         while (i < s.length()) {
//             char ch = s.charAt(i);
//             int len = 0;
//             while (i < s.length() && s.charAt(i) == ch) {
//                 len++;
//                 i++;
//             }
//             int maxPress = (ch == '7' || ch == '9') ? 4 : 3;
//             ans = (ans * countWays(len, maxPress)) % MOD;
//         }
//         System.out.println(ans);
//         sc.close();
//     }
// }

