import java.util.*;
public class Heroes_Villains {
    static boolean check(int start, int[] v, int m, int h) {
        int hero = 1;
        long health = h;
        for (int i = start; i < v.length; i++) {
            while (true) {
                if (hero > m)
                    return false;
                if (health > v[i]) {
                    health -= v[i];
                    break;
                } else if (health == v[i]) {
                    hero++;
                    health = h;
                    break;
                } else {
                    hero++;
                    if (hero > m)
                        return false;
                    health = h;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int h = sc.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < n; i++)
            v[i] = sc.nextInt();
        int l = 0, r = n, ans = n;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (check(mid, v, m, h)) {
                ans = mid;
                r = mid - 1;
            } else
                l = mid + 1;
        }
        System.out.println(ans);
    }
}