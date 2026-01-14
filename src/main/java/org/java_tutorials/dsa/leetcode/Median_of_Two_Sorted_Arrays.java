void main() {
    System.out.println(solution(new int[]{1, 10}, new int[]{7, 8, 9, 2}));
    System.out.println(findMedianSortedArrays(new int[]{1, 10}, new int[]{7, 8, 9, 2}));
}

public double findMedianSortedArrays(int[] num1, int[] num2) {
    int[] m = new int[num1.length + num2.length];
    System.arraycopy(num1, 0, m, 0, num1.length);
    System.arraycopy(num2, 0, m, num1.length, num2.length);
    Arrays.sort(m);
    return m.length % 2 == 0 ?
            ((m[(m.length) / 2 - 1] + m[(m.length) / 2]) / 2.0)
            : m[(m.length + 1) / 2 - 1];
}

double solution(int[] a, int[] b) {
    int n = a.length, m = b.length;
    int total = n + m;

    int i = 0, j = 0;
    int prev = 0, curr = 0;

    for (int count = 0; count <= total / 2; count++) {
        prev = curr;
        if (i < n && (j >= m || a[i] <= b[j])) {
            curr = a[i++];
        } else {
            curr = b[j++];
        }
    }

    if (total % 2 == 0)
        return (prev + curr) / 2.0;
    else
        return curr;

}