import java.util.*;
public class Grid_Shape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] grid =new char[n][m];
        for(int i=0;i<n;i++){
            grid[i]=sc.next().toCharArray();
        }
        int time = 0;
        while (true) {
            boolean changed = false;
            char[][] temp = new char[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    temp[i][j] = grid[i][j];
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (grid[i][j] == 'A') {
                        if (i > 0 && grid[i - 1][j] == 'E') {
                            temp[i - 1][j] = 'A';
                            changed = true;
                        }
                        if (i < n - 1 && grid[i + 1][j] == 'E') {
                            temp[i + 1][j] = 'A';
                            changed = true;
                        }
                        if (j > 0 && grid[i][j - 1] == 'E') {
                            temp[i][j - 1] = 'A';
                            changed = true;
                        }
                        if (j < m - 1 && grid[i][j + 1] == 'E') {
                            temp[i][j + 1] = 'A';
                            changed = true;
                        }
                    }
                }
            }
            if (!changed)
                break;
            grid = temp;
            time++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 'E') {
                    System.out.println(-1);
                    return;
                }
            }
        }
        System.out.println(time);
    }
}

//Case1
//Input
// 2
// 2
// AE
// EE
//Output
// 2

//Case2
//Input
// 3
// 2
// AE
// **
// EE
//Output
//-1