package org.java_tutorials.function;

class Author {
    protected int booksWritten;
    protected static double royalty = 50;
    public Author(int b) {
        booksWritten = b;
    }
    public final double calculateRoyalty() {
        return booksWritten * royalty;
    }
}
class FamousAuthor extends Author {
    public FamousAuthor(int b) {
        super(b);
    }

}
