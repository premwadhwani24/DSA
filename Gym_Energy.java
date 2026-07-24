import java.util.*;

public class Gym_Energy {

    public static int minimumExercises(int E, int[] A) {
        Arrays.sort(A);

        int n = A.length;
        long energy = E;
        int count = 0;

        for (int i = n - 1; i >= 0; i--) {

            // First use
            energy -= A[i];
            count++;
            if (energy <= 0)
                return count;

            // Second use
            energy -= A[i];
            count++;
            if (energy <= 0)
                return count;
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int E = sc.nextInt();
        int N = sc.nextInt();

        int[] A = new int[N];

        for (int i = 0; i < N; i++)
            A[i] = sc.nextInt();

        System.out.println(minimumExercises(E, A));
    }
}