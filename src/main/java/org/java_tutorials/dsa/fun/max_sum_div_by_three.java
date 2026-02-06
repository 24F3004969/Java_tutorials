
void main() {
    IO.println(max_sum_div_by_three(new int[]{2, 6, 2, 2, 7}));
    IO.println(maxSumDivisibleBy3(new int[]{2, 6, 2, 2, 7}));
}

int max_sum_div_by_three(int[] nums) {
    var non_factor1 = new ArrayList<Integer>();
    var non_factor2 = new ArrayList<Integer>();
    int sum = 0, s_f = 0;
    for (int j : nums) {
        var rem = j % 3;
        if (rem == 0)
            sum += j;
        else {
            if (rem == 1)
                non_factor1.add(j);
            else
                non_factor2.add(j);
        }
    }
    int mx = Math.min(non_factor1.size(), non_factor2.size());
    if (non_factor1.size() > non_factor2.size())
        non_factor1.sort(Collections.reverseOrder());
    else
        non_factor2.sort(Collections.reverseOrder());
    IO.println(non_factor1 + "  " + non_factor2);
    for (int i = 0; i < mx; i++) {
        s_f += non_factor1.get(i) + non_factor2.get(i);
    }
    return (s_f + sum) % 3 == 0 ? (s_f + sum) : 0;
}

int maxSumDivisibleBy3(int[] nums) {
    long total = 0;
    List<Integer> r1 = new ArrayList<>();
    List<Integer> r2 = new ArrayList<>();

    for (int x : nums) {
        total += x;
        int r = x % 3;
        if (r == 1) r1.add(x);
        else if (r == 2) r2.add(x);
    }
    Collections.sort(r1);
    Collections.sort(r2);

    int mod = (int) (total % 3);
    if (mod == 0) return (int) total;

    long option1 = Long.MIN_VALUE, option2 = Long.MIN_VALUE;
    if (mod == 1) {
        if (!r1.isEmpty()) option1 = total - r1.getFirst();
        if (r2.size() >= 2) option2 = total - (long) r2.get(0) - r2.get(1);
    } else {
        if (!r2.isEmpty()) option1 = total - r2.getFirst();
        if (r1.size() >= 2) option2 = total - (long) r1.get(0) - r1.get(1);
    }

    long best = Math.max(option1, option2);
    return best == Long.MIN_VALUE ? 0 : (int) best;
}

int max_sum_div_by_three_(int[] nums) {
    Arrays.sort(nums);
    IO.println(Arrays.toString(nums));
    var non_factor1 = new ArrayList<Integer>(2);
    var non_factor2 = new ArrayList<Integer>(2);
    int sum = 0, s_f = 0, s1 = 0, s2 = 0;
    for (int j : nums) {
        var rem = j % 3;
        if (rem == 0)
            sum += j;
        else {
            if (rem == 1) {
                non_factor1.add(j);
                s1 += j;
                if (s1 % 3 == 0) {
                    sum += s1;
                    non_factor1.clear();
                }
            } else {
                non_factor2.add(j);
                s2 += j;
                if (s2 % 3 == 0) {
                    sum += s2;
                    non_factor2.clear();
                }
            }

        }
    }
    int mx = Math.min(non_factor1.size(), non_factor2.size());
    IO.println(non_factor1 + "  " + non_factor2);
    IO.println(sum);
    for (int i = 0; i < mx; i++) {
        s_f += non_factor1.get(i) + non_factor2.get(i);
    }
    return (s_f + sum) % 3 == 0 ? (s_f + sum) : 0;
}


