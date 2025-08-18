package org.java_tutorials.icse.class9th;

import java.util.*;

interface Iterator {
    public boolean has_next();

    public Object get_next();
}

class Sequence {
    private final int maxLimit = 80;
    private SeqIterator _iter = null;
    int[] iArr;
    int size;

    //implement the parameterized constructor to initialize size
    public Sequence(int size) {
        this.size = size;
        iArr = new int[maxLimit];
        _iter = new SeqIterator();
    }

    public void addTo(int i) {
        if (_iter.indx < maxLimit)
            iArr[++_iter.indx] = i;

    }

    public Iterator get_Iterator() {
        return new SeqIterator();
    }
//implement addTo(elem) to add an int elem to the sequence

//implement get_Iterator() to return Iterator object

    private class SeqIterator implements Iterator {
        int indx;

        public SeqIterator() {
            indx = -1;
        }

        @Override
        public boolean has_next() {
            return this.indx < size-1;
        }

        @Override
        public Object get_next() {
            return iArr[++indx];
        }

        //implement has_next()
        //implement get_next()
    }
}

class FClass {
    public static void main(String[] args) {
        Sequence sObj = new Sequence(5);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            sObj.addTo(sc.nextInt());
        }
        Iterator i = sObj.get_Iterator();
        while (i.has_next())
            System.out.print(i.get_next() + ", ");
    }
}