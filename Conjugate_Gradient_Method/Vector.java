package Conjugate_Gradient_Method;
// Created: November 2022
import java.util.Arrays;
public class Vector {
    private double[] elements;
    public Vector(double[] elements) {
        this.elements = elements.clone();
    }
    public int size() {
        return elements.length;
    }
    public double get(int index) {
        return elements[index];
    }
    public void set(int index, double value) {
        elements[index] = value;
    }
    public Vector add(Vector other) {
        double[] result = new double[size()];
        for (int i = 0; i < size(); i++) {
            result[i] = elements[i] + other.get(i);
        }
        return new Vector(result);
    }
    public Vector subtract(Vector other) {
        double[] result = new double[size()];
        for (int i = 0; i < size(); i++) {
            result[i] = elements[i] - other.get(i);
        }
        return new Vector(result);
    }
    public double dotProduct(Vector other) {
        double result = 0;
        for (int i = 0; i < size(); i++) {
            result += elements[i] * other.get(i);
        }
        return result;
    }
    public Vector scalarMultiply(double scalar) {
        double[] result = new double[size()];
        for (int i = 0; i < size(); i++) {
            result[i] = scalar * elements[i];
        }
        return new Vector(result);
    }
    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}