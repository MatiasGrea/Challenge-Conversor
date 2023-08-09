
import java.awt.GridLayout;
import javax.swing.*;

public class ConversorGrafico extends Conversor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ConversorGrafico() {
		setTitle("Conversor de Monedas");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 400);
		setLocationRelativeTo(null);
		@SuppressWarnings("unused")
		Object opcionesArray = JOptionPane.showInputDialog(null, "Escoja una opcion", "Tipo de conversor",
				JOptionPane.DEFAULT_OPTION, null, opciones, opciones[0]);
		JPanel panel = new JPanel(new GridLayout(4, 2));
		JLabel montoLabel = new JLabel("Ingrese Cantidad");
		textField = new JTextField();
		JLabel fromCurrencyJLabel = new JLabel("De: ");
		fromCurrencyComboBox = new JComboBox<>(new String[] { "ARS", "CLP", "USD", "EUR" });
		JLabel toCurrencyJLabel = new JLabel("Hacia: ");
		toCurrencyComboBox = new JComboBox<>(new String[] { "ARS", "CLP", "USD", "EUR" });
		JButton convertButton = new JButton("Convertir");
		convertButton.addActionListener(this);
		resultLabel = new JLabel();

		panel.add(montoLabel);
		panel.add(textField);
		panel.add(fromCurrencyJLabel);
		panel.add(fromCurrencyComboBox);
		panel.add(toCurrencyJLabel);
		panel.add(toCurrencyComboBox);
		panel.add(convertButton);
		panel.add(resultLabel);
		add(panel);
	}

	public static void main(String[] args) {
		ConversorGrafico ventana = new ConversorGrafico();
		ventana.setVisible(true);
	}

}
