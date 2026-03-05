int c = 0;

void main() {
    f(6);
    IO.println(c);
}

int f(int n) {
    c++;
    if (n > 0) {
        return f(n - 1) + f(n - 2);
    } else
        return n;
}