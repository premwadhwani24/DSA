import java.util.Scanner;

public class Rod_Cutting {

    public static int cutRod(int[] price, int n) {

        int[] dp = new int[n + 1];

        dp[0] = 0;

        for (int i = 1; i <= n; i++) {

            int maxValue = Integer.MIN_VALUE;

            for (int j = 1; j <= i; j++) {

                maxValue = Math.max(maxValue, price[j - 1] + dp[i - j]);
            }

            dp[i] = maxValue;
        }

        return dp[n];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of price array: ");
        int n = sc.nextInt();

        int[] price = new int[n];

        System.out.println("Enter prices:");

        for (int i = 0; i < n; i++) {
            price[i] = sc.nextInt();
        }

        int ans = cutRod(price, n);

        System.out.println("Maximum Obtainable Value = " + ans);

        sc.close();
    }
}