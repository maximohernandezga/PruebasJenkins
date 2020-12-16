package calculadoraTest;

import org.junit.Test;

import Modelo.Operaciones;

public class ModeloOperacionSumaTest {

    private Operaciones calculadora = new Operaciones();
    private int resultado;
    private int resultadoEsperado;
    private int primerNro;
    private int segundoNro;

    @Test
    public void getValorCalculoTest() {
	primerNro = 4;
	segundoNro = 3;
	resultadoEsperado = 7;
	resultado = calculadora.getValorSuma(primerNro, segundoNro);
	org.junit.Assert.assertEquals(resultado, resultadoEsperado);
    }

}
