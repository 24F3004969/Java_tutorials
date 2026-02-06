void main() {
    maximalRectangle(new char[][]{{'1', '0', '1', '0', '0'},
                                  {'1', '0', '1', '1', '1'},
                                  {'1', '1', '1', '1', '1'},
                                  {'1', '0', '0', '1', '0'}});
    System.out.println(new Node(1, 2).equals(new Node(1, 1)));
}

public int maximalRectangle(char[][] matrix) {

    return 0;
}

public static int longestCommonConsecutiveOnes(long a, long b) {
    long c = a & b;
    int maxRun = 0;
    int currentRun = 0;
    while (c != 0) {
        if ((c & 1L) == 1L) {
            currentRun++;
            if (currentRun > maxRun) maxRun = currentRun;
        } else {
            currentRun = 0;
        }
        c >>= 1; // logical shift right
    }
    return maxRun;
}


public static int longestCommonConsecutiveOnesStr(String a, String b) {
    int n = Math.min(a.length(), b.length());
    int run = 0, best = 0;
    // Align to the right (LSB). Iterate from the end.
    for (int i = 0; i < n; i++) {
        char ca = a.charAt(a.length() - 1 - i);
        char cb = b.charAt(b.length() - 1 - i);
        if (ca == '1' && cb == '1') {
            run++;
            best = Math.max(best, run);
        } else {
            run = 0;
        }
    }
    return best;
}


public record Node(int start, int end) {
}
