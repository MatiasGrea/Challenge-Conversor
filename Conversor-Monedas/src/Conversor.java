
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.text.*;

public class Conversor extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
	}

	protected double[][] tasaConversion = { { 1, 0.33, 0.0038, 0.0034 }, { 0.33, 1, 0.0012, 0.0011 },
			{ 264.39, 809.96, 1, 0.89 }, { 296.79, 909.72, 1.12, 1 } };// ARS,CLP,USD,EUR
	public String[] opciones = { "Conversor Monedas", "Conversor temperatura" };
	protected JTextField textField;
	protected Component fromCurrencyJComboBox;
	protected JComboBox<String> fromCurrencyComboBox;
	protected JComboBox<String> toCurrencyComboBox;
	protected JTextComponent resultadoLabel;
	protected JLabel resultLabel;

	public void actionPerformed(ActionEvent e) {
		double monto = Double.parseDouble(textField.getText());
		int fromCurrencyIndex = fromCurrencyComboBox.getSelectedIndex();
		int toCurrencyIndex = toCurrencyComboBox.getSelectedIndex();
		double conversionRate = tasaConversion[fromCurrencyIndex][toCurrencyIndex];
		double resultado = monto * conversionRate;
		resultLabel.setText(String.format("%.2f", resultado));

	}
}
