import java.util.*;
public class Mountain_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int answer = n;
        for (int peak = 0; peak < n; peak++) {
            int changes = 0;
            for (int i = 0; i < n; i++) {
                int expected = Math.abs(i - peak);
                int value = arr[peak] - expected;

                if (arr[i] != value)
                    changes++;
            }
            answer = Math.min(answer, changes);
        }
        for (int peak = 0; peak < n - 1; peak++) {
            int changes = 0;
            for (int i = 0; i < n; i++) {
                int dist = Math.max(Math.abs(i - peak), Math.abs(i - (peak + 1)));
                int value = arr[peak] - dist;
                if (arr[i] != value)
                    changes++;
            }
            answer = Math.min(answer, changes);
        }
        System.out.println(answer);
    }
}