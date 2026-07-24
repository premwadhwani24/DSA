import java.util.*;
public class maximum_weight_possible_frequency_balanced_windows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] A = new int[n];
        long[] W = new long[n];
        for (int i = 0; i < n; i++)
            A[i] = sc.nextInt();
        for (int i = 0; i < n; i++)
            W[i] = sc.nextLong();
        long ans = 0;
        for (int l = 0; l < n; l++) {
            HashMap<Integer,Integer> freq = new HashMap<>();
            long sum = 0;
            int maxFreq = 0;
            for (int r = l; r < n; r++) {
                sum += W[r];
                freq.put(A[r], freq.getOrDefault(A[r],0)+1);
                maxFreq = Math.max(maxFreq, freq.get(A[r]));
                int len = r-l+1;
                if(maxFreq > len/2)
                    ans = Math.max(ans,sum);
            }
        }
        System.out.println(ans);
    }
}