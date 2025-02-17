package com.testwit.calculadora;

import static org.junit.jupiter.api.Assertions.*;

import com.testwit.calculadora.service.CalculadoraService;
import org.junit.jupiter.api.Test;

class ServicoCalculadoraTest {

    CalculadoraService calculadora = new CalculadoraService();

    @Test
    void testSomar() {
        assertEquals(5, calculadora.soma(2, 3));
    }

    @Test
    void testDividir() {
        assertEquals(2, calculadora.divide(4, 2));
    }

    @Test
    void testDivisaoPorZero() {
        assertThrows(IllegalArgumentException.class, () -> calculadora.divide(4, 0));
    }
}
