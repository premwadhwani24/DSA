import java.util.*;

public class Number_Pattern {

    String printMinNumberForPattern(String S) {
        StringBuilder ans = new StringBuilder();
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i <= S.length(); i++) {
            st.push(i + 1);

            if (i == S.length() || S.charAt(i) == 'I') {
                while (!st.isEmpty()) {
                    ans.append(st.pop());
                }
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the pattern (I/D): ");
        String pattern = sc.next();

        Number_Pattern obj = new Number_Pattern();

        String result = obj.printMinNumberForPattern(pattern);

        System.out.println("Minimum number following the pattern: " + result);

        sc.close();
    }
}