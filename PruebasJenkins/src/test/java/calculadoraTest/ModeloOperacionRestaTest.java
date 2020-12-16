package calculadoraTest;

import org.junit.Test;

import Modelo.Operaciones;

public class ModeloOperacionRestaTest {

    private Operaciones operaciones = new Operaciones();
    private int resultado;
    private int resultadoEsperado;
    private int primerNro;
    private int segundoNro;

    @Test
    public void getValorRestaTest() {
	primerNro = 4;
	segundoNro = 3;
	resultadoEsperado = 1;
	resultado = operaciones.getValorResta(primerNro, segundoNro);
	org.junit.Assert.assertEquals(resultado, resultadoEsperado);
    }

}