import java.util.Scanner;

public class Min_Swaps_Array {
    public static int solve(int n, int[] arr) {
        int ones = 0;
        for (int num : arr) {
            if (num == 1) {
                ones++;
            }
        }

        if (ones <= 1) {
            return 0;
        }

        int currentOnes = 0;
        for (int i = 0; i < ones; i++) {
            if (arr[i] == 1) {
                currentOnes++;
            }
        }

        int maxOnes = currentOnes;
        for (int i = ones; i < n; i++) {
            if (arr[i] == 1) {
                currentOnes++;
            }
            if (arr[i - ones] == 1) {
                currentOnes--;
            }
            maxOnes = Math.max(maxOnes, currentOnes);
        }

        return ones - maxOnes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int answer = solve(n, arr);
        System.out.println(answer);
        sc.close();
    }
}