package me.elordenador.entornos.actividad2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        System.out.println("---Inicio de las pruebas---");
    }

    @Test
    void testSumar() {
        assertEquals(48, Calculadora.sumar(16,32));
    }

    @Test
    void testRestar() {
        assertEquals(-16, Calculadora.restar(16, 32));
    }

    @Test
    void testMultiplicar() {
        assertEquals(512, Calculadora.multiplicar(16, 32));
    }

    @Test
    void testDividir() {
        assertEquals(0.5, Calculadora.dividir(16, 32));
        assertThrows(ArithmeticException.class, () -> Calculadora.dividir(16, 0));
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
        System.out.println("---Final de las pruebas---");
    }
}
