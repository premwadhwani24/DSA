import java.util.*;

public class FindAdditionalIds {

    public static List<Integer> findAdditionalIds(List<Integer> array1, List<Integer> array2) {

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < array2.size(); i++) {

            boolean found = false;

            for (int j = 0; j < array1.size(); j++) {

                if (array2.get(i).equals(array1.get(j))) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                ans.add(array2.get(i));
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();

        List<Integer> array1 = new ArrayList<>();

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n; i++) {
            array1.add(sc.nextInt());
        }

        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();

        List<Integer> array2 = new ArrayList<>();

        System.out.println("Enter elements of second array:");
        for (int i = 0; i < m; i++) {
            array2.add(sc.nextInt());
        }

        List<Integer> result = findAdditionalIds(array1, array2);

        System.out.println("Additional IDs are: " + result);

        sc.close();
    }
}