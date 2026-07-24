import java.util.*;
public class Road_Construction {
    static int n;
    static long[] a;
    static boolean possible(int days) {
        long total = (1L << days) - 1;
        long prev = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            long cur = Math.min(a[i], prev - 1);
            if (a[i] - cur > total)
                return false;
            prev = cur;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextLong();
        int lo = 0;
        int hi = 31;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (possible(mid))
                hi = mid;
            else
                lo = mid + 1;
        }
        System.out.println(lo);
    }
}
