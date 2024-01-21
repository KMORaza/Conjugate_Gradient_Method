package Conjugate_Gradient_Method;
// Created: November 2022
public class ConjugateGradientSolver {
    private Matrix A;
    private Vector b;
    public ConjugateGradientSolver(Matrix A, Vector b) {
        this.A = A;
        this.b = b;
    }
    public Vector solve(Vector initialGuess, double tolerance, int maxIterations) {
        Vector x = initialGuess;
        Vector r = b.subtract(A.multiply(x));
        Vector p = r;
        for (int k = 0; k < maxIterations; k++) {
            double alpha = r.dotProduct(r) / p.dotProduct(A.multiply(p));
            x = x.add(p.scalarMultiply(alpha));
            Vector rNext = r.subtract(A.multiply(p).scalarMultiply(alpha));
            if (rNext.dotProduct(rNext) < tolerance * tolerance) {
                System.out.println("Converged in " + (k + 1) + " iterations.");
                return x;
            }
            double beta = rNext.dotProduct(rNext) / r.dotProduct(r);
            p = rNext.add(p.scalarMultiply(beta));
            r = rNext;
        }
        System.out.println("Unable to converge!");
        return x;
    }
}