package Ejecutable;

import Controlador.CalculadoraControlador;
import Modelo.Operaciones;
import Vista.Ventana;

public class Calculadora {

    public static void main(String[] args) {

	Ventana laVista = new Ventana();
	Operaciones elModelo = new Operaciones();
	new CalculadoraControlador(laVista, elModelo);
    }

}