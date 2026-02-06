void main() {
    IO.println(Arrays.toString(_twoSum(new int[]{2,7,11,15}, 9)));
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

public int[] _twoSum(int[] nums, int target) {
    var map = new HashMap<Integer, ArrayList<Integer>>();
    for (var i = 0; i < nums.length; i++) {
        if (map.containsKey(nums[i])) {
            map.get(nums[i]).add(i);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(i);
            map.put(nums[i], list);
        }
    }
    for (int x : map.keySet()) {
        if (map.containsKey(target - x)) {
            return new int[]{map.get(x).getFirst(), map.get(target - x).getLast()};
        }
    }
    return new int[]{0, 0};
}