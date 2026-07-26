class First_Missing_Positive {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int correctIndex = nums[i] - 1;
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1;
    }

    public static void main(String[] args) {
        First_Missing_Positive solver = new First_Missing_Positive();
        int[][] testCases = {
            {1, 2, 0},
            {3, 4, -1, 1},
            {7, 8, 9, 11, 12}
        };

        for (int[] nums : testCases) {
            System.out.println(solver.firstMissingPositive(nums));
        }
    }
}