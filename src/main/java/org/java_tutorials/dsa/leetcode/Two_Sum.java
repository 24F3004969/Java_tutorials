void main() {
    IO.println(Arrays.toString(twoSum(new int[]{0, 4, 3, 0}, 0)));
    LinkedHashSet<Integer> set = new LinkedHashSet<>();
}

public int[] twoSum(int[] nums, int target) {
    int i, t_index = -1;
    for (i = 0; i < nums.length; i++) {
        int n = nums[i];
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[j] == (target - n)) {
                return new int[]{i, j};
            }
        }
    }
    return new int[]{i, t_index};
}