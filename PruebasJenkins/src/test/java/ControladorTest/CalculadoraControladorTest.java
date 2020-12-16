package ControladorTest;

import org.junit.Test;

import Controlador.CalculadoraControlador;

public class CalculadoraControladorTest {

    private CalculadoraControlador prueba = new CalculadoraControlador();
    private String resultado;
    private String resultadoEsperado;

    @Test
    public void getValorVariableTest() {
	resultadoEsperado = prueba.getCadena();
	// resultado = "Prueba de test del paquete Controlador";
	resultado = "Texto pa reventar la prueba ;)";
	org.junit.Assert.assertEquals(resultado, resultadoEsperado);
    }

}
