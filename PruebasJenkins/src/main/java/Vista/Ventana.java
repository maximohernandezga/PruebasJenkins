package Vista;

// Esta es la Vista, su único trabajo es mostrar lo que el usuario ve
// No ejecuta ningún cálculo, sino que solamente pasa la información ingresada por el usuario a quien la necesite

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Ventana extends JFrame {

    private JTextField primerNroSuma = new JTextField(10);
    private JLabel simboloSuma = new JLabel("+");
    private JTextField segundoNroSuma = new JTextField(10);
    private JButton botonSumar = new JButton("Calcular");
    private JTextField calcSolucionSuma = new JTextField(10);

    private JTextField primerNroResta = new JTextField(10);
    private JLabel simboloResta = new JLabel("-");
    private JTextField segundoNroResta = new JTextField(10);
    private JButton botonRestar = new JButton("Calcular");
    private JTextField calcSolucionResta = new JTextField(10);

    public Ventana() {

	// Configura la vista y añade los componentes

	JPanel panelCalculadora = new JPanel();

	this.setTitle("Calculadora de sumar");
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setSize(550, 110);

	panelCalculadora.add(primerNroSuma);
	panelCalculadora.add(simboloSuma);
	panelCalculadora.add(segundoNroSuma);
	panelCalculadora.add(botonSumar);
	panelCalculadora.add(calcSolucionSuma);
	calcSolucionSuma.setEditable(false);

	panelCalculadora.add(primerNroResta);
	panelCalculadora.add(simboloResta);
	panelCalculadora.add(segundoNroResta);
	panelCalculadora.add(botonRestar);
	panelCalculadora.add(calcSolucionResta);
	calcSolucionResta.setEditable(false);

	this.add(panelCalculadora);
	this.setVisible(true);

	// Fin de configuración de componentes

    }

    // Bloque de getters/setters para proveer acceso a los valores de números
    // (getters), así como para establecer
    // la solución del cálculo realizado (setter), ya que la vista "no sabe" sobre
    // la existencia del modelo

    // SUMA
    // ---------------------------------------------------------------------------------------------
    public int getPrimerNroSuma() {

	return Integer.parseInt(primerNroSuma.getText()); // getText() retorna el valor en el JTextField

    }

    public int getSegundoNroSuma() {

	return Integer.parseInt(segundoNroSuma.getText());

    }

    public int getCalcSolucionSuma() {

	return Integer.parseInt(calcSolucionSuma.getText());

    }

    public void setCalcSolucionSuma(int solucion) {

	calcSolucionSuma.setText(Integer.toString(solucion));
	// Convertimos el entero solucion a una cadena de texto

    }

    // Si se hace clic sobre botonSumar se ejecuta un método en el controlador
    // llamado actionPerformed()

    public void cargarSumaListener(ActionListener escucharBotonSumar) {

	botonSumar.addActionListener(escucharBotonSumar);

    }

    // RESTA
    // ---------------------------------------------------------------------------------------------
    public int getPrimerNroResta() {

	return Integer.parseInt(primerNroResta.getText()); // getText() retorna el valor en el JTextField

    }

    public int getSegundoNroResta() {

	return Integer.parseInt(segundoNroResta.getText());

    }

    public int getCalcSolucionResta() {

	return Integer.parseInt(calcSolucionResta.getText());

    }

    public void setCalcSolucionResta(int solucion) {

	calcSolucionResta.setText(Integer.toString(solucion));
	// Convertimos el entero solucion a una cadena de texto

    }

    // Si se hace clic sobre botonSumar se ejecuta un método en el controlador
    // llamado actionPerformed()

    public void cargarRestaListener(ActionListener escucharBotonRestar) {

	botonRestar.addActionListener(escucharBotonRestar);

    }

    // Abrimos una ventana popup que contiene el mensaje de error pasado como
    // argumento

    public void mostrarMsjError(String msjError) {

	JOptionPane.showMessageDialog(this, msjError);

    }

}
