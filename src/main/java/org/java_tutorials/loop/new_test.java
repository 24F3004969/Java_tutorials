import static java.lang.IO.*;

void main() {
    var name = readln("Please enter your name: \n");
    println("Pleased to meet you, " + name);
    var n = 12;
    println(factorial(n));
    fibonacchi_series(4);
}

int factorial(int n) {
    return n > 1 ? n * factorial(n - 1) : n;
}

void fibonacchi_series(int n) {
    for (int i = -1; i <= 4; i++) {
        print(fibonacchi(i) + " , ");
    }
}

int fibonacchi(int n) {
    return n == 0 ? 1 : n < 0 ? 0 : (fibonacchi(n - 1) + fibonacchi(n - 2));
}

public static boolean isPalindromeWord(String s) {
    for (int i = 0; i < s.length() / 2; i++) {
        if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
            return false;
        }
    }
    return true;
}