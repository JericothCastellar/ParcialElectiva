package com.calculator.calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author leofa
 */
public class CalculadorTest {

    @Test
    public void testSumar() {
        Calculador calc = new Calculador();
        assertEquals(5, calc.sumar(2, 3));
    }

    @Test
    public void testRestar() {
        Calculador calc = new Calculador();
        assertEquals(1, calc.restar(3, 2));
    }

    @Test
    public void testMultiplicar() {
        Calculador calc = new Calculador();
        assertEquals(6, calc.multiplicar(2, 3));
    }

    @Test
    public void testDividir() {
        Calculador calc = new Calculador();
        assertEquals(2, calc.dividir(6, 3));
    }

    @Test
    public void testDivisionPorCero() {
        Calculador calc = new Calculador();
        assertThrows(ArithmeticException.class, () -> calc.dividir(5, 0));
    }

    @Test
    public void testSumarNegativos() {
        Calculador calc = new Calculador();
        assertEquals(-5, calc.sumar(-2, -3));
    }

    @Test
    public void testRestarConCero() {
        Calculador calc = new Calculador();
        assertEquals(4, calc.restar(4, 0));
    }

    @Test
    public void testMultiplicarPorCero() {
        Calculador calc = new Calculador();
        assertEquals(0, calc.multiplicar(7, 0));
    }

    @Test
    public void testDividirNoExacto() {
        Calculador calc = new Calculador();
        assertEquals(2.5, calc.dividir(5, 2));
    }

}
