import java.util.*;
public class maximum_possible_sum_mode_frequencies_all_K_groups {
    static int n, k, ans = 0;
    static int[] a;
    static int score(int l, int r) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = l; i <= r; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
            max = Math.max(max, map.get(a[i]));
        }
        return max;
    }
    static void solve(int start, int groups, int sum) {
        if (groups == k) {
            ans = Math.max(ans, sum + score(start, n - 1));
            return;
        }
        for (int i = start; i < n - (k - groups); i++) {
            solve(i + 1, groups + 1, sum + score(start, i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        solve(0, 1, 0);
        System.out.println(ans);
    }
}


// cas1:
// 7
// 2
// 1
// 2
// 2
// 3
// 1
// 1
// 1
// O/p:5

// case2:
// 1
// 1
// 5
// O/p:1

// case3:
// 5
// 1
// 1
// 2
// 3
// 4
// 5
// O/p:1

// case4:
// 5
// 5
// 1
// 2
// 3
// 4
// 5
// o/p:5

// case5:
// 5
// 3
// 7
// 7
// 7
// 7 
// 7
// o/p:5

// case6:
// 4
// 2
// 1
// 2
// 1
// 2
// o/p:3


// case7:
// 7
// 3
// 1
// 1
// 2
// 1
// 2
// 2
// 1
// o/p:6
