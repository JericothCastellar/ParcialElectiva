package com.calculator.calculadora;

/**
 * Provee operaciones básicas de una calculadora.
 * Incluye suma, resta, multiplicación y división.
 * @author leofa
 */
public final class Calculador {

    /**
     * Suma dos números enteros.
     * @param a primer número
     * @param b segundo número
     * @return resultado de la suma
     */
    public int sumar(final int a, final int b) {
        return a + b;
    }

    /**
     * Resta dos números enteros.
     * @param a primer número
     * @param b segundo número
     * @return resultado de la resta
     */
    public int restar(final int a, final int b) {
        return a - b;
    }

    /**
     * Multiplica dos números enteros.
     * @param a primer número
     * @param b segundo número
     * @return resultado de la multiplicación
     */
    public int multiplicar(final int a, final int b) {
        return a * b;
    }

    /**
     * Divide dos números enteros.
     * @param a numerador
     * @param b denominador
     * @return resultado de la división
     * @throws ArithmeticException si b es 0
     */
    public double dividir(final int a, final int b) {
        if (b == 0) {
            throw new ArithmeticException("No dividir por cero");
        }
        return (double) a / b;
    }
}
