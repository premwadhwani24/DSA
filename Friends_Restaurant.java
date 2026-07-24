import java.util.*;
public class Friends_Restaurant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] x = new long[n];
            long[] diff = new long[n];
            for (int i = 0; i < n; i++)
                x[i] = sc.nextLong();
            for (int i = 0; i < n; i++) {
                long y = sc.nextLong();
                diff[i] = y - x[i];
            }
            Arrays.sort(diff);
            int i = 0;
            int j = n - 1;
            int ans = 0;
            while (i < j) {
                if (diff[i] + diff[j] >= 0) {
                    ans++;
                    i++;
                    j--;
                } else {
                    i++;
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}