package Conjugate_Gradient_Method;
// Created: November 2022
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        double[][] matrixData = {{4, 1}, {1, 3}};
        double[] vectorData = {3, 4};
        Matrix A = new Matrix(matrixData);
        Vector b = new Vector(vectorData);
        ConjugateGradientSolver solver = new ConjugateGradientSolver(A, b);
        Vector initialGuess = new Vector(new double[]{0, 0});
        double tolerance = 1e-6;
        int maxIterations = 1000;
        Vector solution = solver.solve(initialGuess, tolerance, maxIterations);
        System.out.println("Solution: " + solution);
    }
}