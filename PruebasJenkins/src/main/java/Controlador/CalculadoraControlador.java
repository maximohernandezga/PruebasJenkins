package Controlador;

// El Controlador coordina las interacciones entre la Vista y el Modelo

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.Operaciones;
import Vista.Ventana;

public class CalculadoraControlador {

    private Ventana laVista;
    private Operaciones elModelo;
    private String cadena;

    public CalculadoraControlador() { // Constructor vacío, de cara a los test
	this.cadena = "Prueba de test del paquete Controlador";
    }

    // get, de cara al test
    public String getCadena() {
	return cadena;
    }

    public CalculadoraControlador(Ventana laVista, Operaciones elModelo) {

	this.laVista = laVista;
	this.elModelo = elModelo;

	// Le indicamos a la Vista que cada vez que el botón de calcular sea clicado
	// ejecute el método actionPerformed() de la clase interna correspondiente

	this.laVista.cargarSumaListener(new CalcularSumaListener());
	this.laVista.cargarRestaListener(new CalcularRestaListener());

    }

    class CalcularSumaListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {

	    int primerNro, segundoNro = 0;

	    // Encerramos las interacciones con la Vista dentro de un try en caso de que los
	    // números no hayan sido ingresados correctamente

	    try {

		primerNro = laVista.getPrimerNroSuma();
		segundoNro = laVista.getSegundoNroSuma();

		laVista.setCalcSolucionSuma(elModelo.getValorSuma(primerNro, segundoNro));

	    } catch (NumberFormatException ex) {

		System.out.println(ex);

		laVista.mostrarMsjError("Error: ingresa dos (2) numeros enteros.");

	    }

	}

    }

    class CalcularRestaListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {

	    int primerNro, segundoNro = 0;

	    // Encerramos las interacciones con la Vista dentro de un try en caso de que los
	    // números no hayan sido ingresados correctamente

	    try {

		primerNro = laVista.getPrimerNroResta();
		segundoNro = laVista.getSegundoNroResta();

		laVista.setCalcSolucionResta(elModelo.getValorResta(primerNro, segundoNro));

	    } catch (NumberFormatException ex) {

		System.out.println(ex);

		laVista.mostrarMsjError("Error: ingresa dos (2) numeros enteros.");

	    }

	}

    }
}
