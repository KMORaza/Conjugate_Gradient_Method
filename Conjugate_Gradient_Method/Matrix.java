package Conjugate_Gradient_Method;
// Created: November 2022
import java.util.Arrays;
public class Matrix {
    private double[][] elements;
    public Matrix(double[][] elements) {
        this.elements = new double[elements.length][elements[0].length];
        for (int i = 0; i < elements.length; i++) {
            this.elements[i] = elements[i].clone();
        }
    }
    public int rows() {
        return elements.length;
    }
    public int columns() {
        return elements[0].length;
    }
    public double get(int row, int col) {
        return elements[row][col];
    }
    public Vector multiply(Vector vector) {
        double[] result = new double[rows()];
        for (int i = 0; i < rows(); i++) {
            for (int j = 0; j < columns(); j++) {
                result[i] += elements[i][j] * vector.get(j);
            }
        }
        return new Vector(result);
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (double[] row : elements) {
            result.append(Arrays.toString(row)).append("\n");
        }
        return result.toString();
    }
}