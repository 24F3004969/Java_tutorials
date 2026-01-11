package org.java_tutorials.tuition.shahir.part_1.tutorials_3;

public record Complex(double real, double imaginary) {
    public double argument() {
        return Math.atan(imaginary / real);
    }

    public double modulus() {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    public Complex conjugate() {
        return new Complex(real, -1 * imaginary);
    }

    public Complex add(Complex number) {
        return new Complex((this.real + number.real), (this.imaginary + number.imaginary));
    }

    public Complex subtract(Complex number) {
        return new Complex((this.real - number.real), (this.imaginary - number.imaginary));
    }

    public Complex product(Complex number) {
        return new Complex((this.real * number.real - this.imaginary * number.imaginary),
                (this.real * number.imaginary + this.imaginary * number.real));
    }

    public Complex division(Complex number) {
        return new Complex(product(number.conjugate()).real / Math.pow(number.modulus(), 2),
                product(number.conjugate()).imaginary / Math.pow(number.modulus(), 2));
    }

    public Complex inverse() {
        return new Complex(1, 0).division(this);
    }

    public Complex pow(int power) {
        var p = new Complex(1, 0);
        var k = this;
        if (power >= 1)
            while (power >= 1) {
            if (power % 2 == 0) {
                k = k.product(this);
                power = power / 2;
            } else {
                p = p.product(k);
                power--;
            }
        }
        else {
            return pow(power * -1).inverse();
        }
        return p;
    }
}
