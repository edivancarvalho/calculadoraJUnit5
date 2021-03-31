package codigos;

public class Calculadora {

	private double resultado = 0;

	public double somar(int n1, int n2) {
		resultado = n1 + n2;
		return resultado;
	}

	public double subtrair(int n1, int n2) {
		resultado = n1 - n2;
		return resultado;
	}

	public double multiplicar(int n1, int n2) {
		resultado = n1 * n2;
		return resultado;
	}

	public double dividir(int n1, int n2) {
		double v1, v2;
		v1 = Double.valueOf(n1);
		v2 = Double.valueOf(n2);
		resultado = v1 / v2;
		return resultado;
	}
}
