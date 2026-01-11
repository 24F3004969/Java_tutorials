//package main.java.org.jmath.util;

/*value class Substring implements CharSequence {
    private String str;
    private int start;
    private int end;

    public Substring(String str, int start, int end) {
        checkBounds(start, end, str.length());
        this.str = str;
        this.start = start;
        this.end = end;
    }

    public int length() {
        return end - start;
    }

    public char charAt(int i) {
        checkBounds(0, i, length());
        return str.charAt(start + i);
    }

    public Substring subSequence(int s, int e) {
        checkBounds(s, e, length());
        return new Substring(str, start + s, start + e);
    }

    public String toString() {
        return str.substring(start, end);
    }

    private static void checkBounds(int start, int end, int length) {
        if (start < 0 || end < start || length < end)
            throw new IndexOutOfBoundsException();
    }

    public static void main(String[] args) {
        Substring s1 = new Substring("abc", 0, 2);
        Substring s2 = null;
        if (s1.length() == 2)
            s2 = s1.subSequence(1, 2);
        CharSequence cs = s2;
        System.out.println(cs); // prints "b"
    }
}*/
