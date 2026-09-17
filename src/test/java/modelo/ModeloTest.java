package modelo;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ModeloTest {

    private Modelo m;   // se declara como atributo, no dentro de cada test

    @Before
    public void setUp() {
        // Se ejecuta ANTES de cada @Test.
        // Creamos una instancia nueva del Modelo para cada prueba.
        m = new Modelo();
    }

    @Test
    public void testSumar() {
        m.setNumeroUno(10);
        m.setNumeroDos(5);
        assertEquals(15, m.sumar());
    }

    @Test
    public void testRestar() {
        m.setNumeroUno(10);
        m.setNumeroDos(5);
        assertEquals(5, m.restar());
    }

    @Test
    public void testMultiplicar() {
        m.setNumeroUno(10);
        m.setNumeroDos(5);
        assertEquals(50, m.multiplicar());
    }

    @Test
    public void testDividir() {
        m.setNumeroUno(10);
        m.setNumeroDos(4);
        assertEquals(2.5, m.dividir(), 0.001);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionPorCero() {
        m.setNumeroUno(10);
        m.setNumeroDos(0);
        m.dividir();
    }
}