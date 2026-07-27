import java.util.*;
public class Beauty_Every_Subarray {
    public static int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        int[] freq = new int[101];
        for (int i = 0; i < k; i++) {
            freq[nums[i] + 50]++;
        }
        int index = 0;
        while (true) {
            int count = 0;
            ans[index] = 0;
            for (int i = 0; i < 50; i++) {
                count += freq[i];
                if (count >= x) {
                    ans[index] = i - 50;
                    break;
                }
            }
            index++;
            if (index == ans.length)
                break;
            freq[nums[index - 1] + 50]--;
            freq[nums[index + k - 1] + 50]++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int x = sc.nextInt();
        int[] result = getSubarrayBeauty(nums, k, x);
        for (int value : result) {
            System.out.print(value + " ");
        }
        sc.close();
    }
}

// cas1: 
// size of array= 5
// nums= 1 -1 -3 -2 3
// k= 3
// x= 2
// o/p= -1 -2 -2 

// case2:
// size of array=4    
// nums= -5 -4 -3 -2
// k= 2
// x= 1
// O/p= -5 -4 -3 

// case3:
// size of array= 4
// nums= 1 2 3 4
// k= 3
// X= 2
// o/p=0 0 