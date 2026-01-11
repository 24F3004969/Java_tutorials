package org.java_tutorials.tuition.shahir.part_1.tutorials_8;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Algebra
{
    private final LinkedHashSet<Monomial> polynomialList=new LinkedHashSet<>();
    private final ArrayList<Integer> division_operator=new ArrayList<>();
    private String polynomial;

    public String getPolynomial() {
        return polynomial;
    }

    public void setPolynomial(String polynomial) {
        this.polynomial = polynomial;
    }

    public Algebra(String polynomial) {
        this.polynomial = polynomial;
        operation();
    }

    private void operation() {
        for (int i = 0; i < polynomial.length(); i++) {

        }
    }
}
