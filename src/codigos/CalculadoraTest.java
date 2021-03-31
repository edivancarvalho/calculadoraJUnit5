package codigos;

public class CalculadoraTest {

	public static void main(String[] args) {

		Calculadora c = new Calculadora();
		int x = 5;
		int y = 4;

		double resultado = c.somar(x, y);

		if (resultado == 10) {
			System.out.println("Calculo da soma está correto");
		}else {
			System.out.println("Calculo da soma está ERRADO");
		}

	}

}
