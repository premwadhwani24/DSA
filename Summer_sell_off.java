import java.util.*;
public class Summer_sell_off {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = sc.nextInt();
        long ans = 0;
        Long[] gain = new Long[n];
        for (int i = 0; i < n; i++) {
            long k = sc.nextLong();
            long l = sc.nextLong();
            long normal = Math.min(k, l);
            long doubled = Math.min(2 * k, l);
            ans += normal;
            gain[i] = doubled - normal;
        }
        Arrays.sort(gain, Collections.reverseOrder());
        for (int i = 0; i < f; i++) {
            ans += gain[i];
        }
        System.out.println(ans);
    }
}