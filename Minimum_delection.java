import java.util.*;
public class Minimum_delection {
    public static int solve(int n, int[] arr) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        if (freqMap.size() == 1) {
            return 0;
        }
        List<Integer> frequencies = new ArrayList<>(freqMap.values());
        Collections.sort(frequencies, Collections.reverseOrder());
        HashSet<Integer> used = new HashSet<>();
        int deletions = 0;
        for (int freq : frequencies) {
            while (freq > 0 && used.contains(freq)) {
                freq--;
                deletions++;
            }
            if (freq > 0) {
                used.add(freq);
            }
        }
        return deletions;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(solve(n, arr));
        sc.close();
    }
}