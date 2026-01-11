package org.java_tutorials.tuition.shahir.part_1.tutorials_13;

public class Kaprekar {
	public static boolean isKaprekar(int n) {
		int sq = n * n, t = sq, c = 0, a = 0, b = 0;
		while (sq > 0) {
			c += 1;
			sq /= 10;
		}
		a += Math.pow(10, c / 2);
		b = a * 10;
		return (c % 2 == 0 && (t % a + t / a) == n) || (c % 2 != 0 && (t % b + t / b) == n);
	}
	public static void main(String []args) {
		System.out.println(isKaprekar(45));
	}
}
