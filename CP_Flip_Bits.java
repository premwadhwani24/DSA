import java.io.*;

public class CP_Flip_Bits {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        StringBuilder ans = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());

            char[] a = br.readLine().toCharArray();
            char[] b = br.readLine().toCharArray();

            boolean[] balanced = new boolean[n];
            int zero = 0, one = 0;

            for (int i = 0; i < n; i++) {
                if (a[i] == '0')
                    zero++;
                else
                    one++;

                if (zero == one)
                    balanced[i] = true;
            }

            boolean flipped = false;
            boolean possible = true;

            for (int i = n - 1; i >= 0; i--) {
                char cur = a[i];

                if (flipped) {
                    cur = (cur == '0') ? '1' : '0';
                }

                if (cur == b[i])
                    continue;

                if (!balanced[i]) {
                    possible = false;
                    break;
                }

                flipped = !flipped;
            }

            ans.append(possible ? "YES" : "NO").append('\n');
        }

        System.out.print(ans);
    }
}