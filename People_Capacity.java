import java.util.*;

public class People_Capacity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int minD = Integer.MAX_VALUE;
        int answer = 0;
        for(int x = 0; x <= c; x++) {
            int oil = x;
            int d = 0;
            for(int i = 0; i < n; i++) {
                if(arr[i] == 1) {    
                    if(oil == c) {
                        d++;
                    } else {
                        oil++;
                    }
                } else {              
                    if(oil == 0) {
                        d++;
                    } else {
                        oil--;
                    }
                }
            }
            if(d < minD) {
                minD = d;
                answer = x;
            }
        }
        System.out.println(answer);
    }
}



// 3
// 3
// -1
// 1
// 1