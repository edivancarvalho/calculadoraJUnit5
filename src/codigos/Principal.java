package codigos;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		int x, y;

		String sX, sY;

		sX = JOptionPane.showInputDialog("Digite o valor 1: ");
		x = Integer.parseInt(sX);

		sY = JOptionPane.showInputDialog("Digite o valor 2: ");
		y = Integer.parseInt(sX);

		Calculadora c = new Calculadora();

		JOptionPane.showMessageDialog(null, "Soma: " + c.somar(x, y));
		JOptionPane.showMessageDialog(null, "Sutração: " + c.subtrair(x, y));
		JOptionPane.showMessageDialog(null, "Multiplicação: " + c.multiplicar(x, y));
		JOptionPane.showMessageDialog(null, "Divisão: " + c.dividir(x, y));
	}

}
