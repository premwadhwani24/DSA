import java.util.*;
public class Min_total_travel_cost {
    static class Emp {
        int costA;
        int costB;
        int diff;
        Emp(int a,int b){
            costA=a;
            costB=Math.min(a,b) +b;
            diff=costA-costB;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=2*n;
        int[] A=new int[m];
        int[] B=new int[m];
        for(int i=0;i<m;i++){
            A[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            B[i]=sc.nextInt();
        }
        Emp[] arr=new Emp[m];
        for(int i=0;i<m;i++)
            arr[i]=new Emp(A[i],B[i]);
            Arrays.sort(arr , (x, y) -> x.diff - y.diff);
            long ans = 0;
            for (int i = 0; i < n; i++)
            ans += arr[i].costA;
             for (int i = n; i < m; i++)
            ans += arr[i].costB;
             System.out.println(ans);}
}


// Cas1:
// 2
// 10 30 50 20
// 20 10 40 30
// o/p: 120

// cas2: 
// 2
// 5 5 5 5
// 5 5 5 5
// o/p: 30

// case3:
// 2
// 100 90 80 70
// 1 2 3 4
// o/p: 156

// case4:
// 2
// 1 2 3 4
// 100 100 100 100
// o/p: 210

// case5:
// 2
// 10 20 30 40
// 5 10 15 20
// o/p: 100
