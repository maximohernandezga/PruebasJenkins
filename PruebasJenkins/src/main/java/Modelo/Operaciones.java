package Modelo;

// Este Modelo contiene los datos y ejecuta todos los cálculos necesarios, ni siquiera sabe que la Vista existe.

public class Operaciones {

    // Guarda el valor de la suma de los números ingresados en la vista.

    private int valorCalculo;

    // getter
    public int getValorSuma(int primerNro, int segundoNro) {

	// Calcula la suma
	valorCalculo = primerNro + segundoNro;

	// Proporciona acceso a los datos

	return valorCalculo;
    }

    public int getValorResta(int primerNro, int segundoNro) {

	// Calcula la resta
	valorCalculo = primerNro - segundoNro;

	// Proporciona acceso a los datos

	return valorCalculo;
    }

}
