package org.java_tutorials.tuition.shahir.part_1.stream;

public class GaussianElimination {
    public void solve(double[][] A, double[] B) {

        int N = B.length;
        for (int k = 0; k < N; k++) {
            /*
            int max = k;
            for (int i = k + 1; i < N; i++)
                if (Math.abs(A[i][k]) > Math.abs(A[max][k]))
                    max = i;


            double[] temp = A[k];
            A[k] = A[max];
            A[max] = temp;


            double t = B[k];
            B[k] = B[max];
            B[max] = t;
            */
            /** pivot within A and B **/
            for (int i = k + 1; i < N; i++) {
                double factor = A[i][k] / A[k][k];
                B[i] -= factor * B[k];
                for (int j = k; j < N; j++)
                    A[i][j] -= factor * A[k][j];
            }
        }

        /** Print row echelon form **/
        printRowEchelonForm(A, B);

        /** back substitution **/
        double[] solution = new double[N];
        for (int i = N - 1; i >= 0; i--) {
            double sum = 0.0;
            for (int j = i + 1; j < N; j++)
                sum += A[i][j] * solution[j];
            solution[i] = (B[i] - sum) / A[i][i];
        }
        /** Print solution **/
        printSolution(solution);
    }

    /**
     * function to print in row    echleon form
     **/
    public void printRowEchelonForm(double[][] A, double[] B) {
        int N = B.length;
        System.out.println("\nRow Echelon form : ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.printf("%.3f ", A[i][j]);
            System.out.printf("| %.3f\n", B[i]);
        }
        System.out.println();
    }

    /**
     * function to print solution
     **/
    public void printSolution(double[] sol) {
        int N = sol.length;
        System.out.println("\nSolution : ");
        for (int i = 0; i < N; i++)
            System.out.printf("%.3f ", sol[i]);
        System.out.println();
    }

    /**
     * Main function
     **/
    public static void main(String[] args) {

        GaussianElimination ge = new GaussianElimination();
        double[] B = {8, -11, -3};
        double[][] A = {{-2321, 13, -1}, {-34, -13, 24}, {-12, 111, 239}};
        ge.solve(A, B);
    }

    int[][] multiply_matrix(int[][] a, int[][] b) {
        int m1 = a.length, n1 = a[0].length;
        int m2 = b.length, n2 = b[0].length;
        if (n1 != m2) {
            System.err.println("This matrix cannot be multiplied");
            return null;
        } else {
            int[][] c = new int[m1][n2];
            for (int i = 0; i < m1; i++) {
                for (int j = 0; j < n2; j++) {
                    int p = 0;
                    for (int k = 0; k < m2; k++) {
                        p = p + a[i][k] * b[k][j];
                    }
                    c[i][j] = p;
                }
            }
            return c;

        }
    }
}