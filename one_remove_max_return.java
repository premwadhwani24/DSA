import java.util.Scanner;
public class one_remove_max_return {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        char digit = sc.next().charAt(0);
        String ans = "";
        boolean first = true;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == digit) {
                String temp = number.substring(0, i) + number.substring(i + 1);

                if (first || temp.compareTo(ans) > 0) {
                    ans = temp;
                    first = false;
                }
            }
        }
        System.out.println(ans);
        sc.close();
    }
}