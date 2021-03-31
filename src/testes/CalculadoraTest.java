package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import codigos.Calculadora;

@DisplayName("Teste de Calculadora")
class CalculadoraTest {

	@BeforeAll
	 static void testExecutarAntes() {
		System.out.println("Executa antes de todos os teste");
	}
	
	@AfterAll
	static void testExecutarDepois() {
		System.out.println("Executa depois de todos os teste");
	}
	
	
	@Test
	@DisplayName("Teste de Soma")
	void testSoma() {
		System.out.println("Testando Soma !!!");
		Calculadora c = new Calculadora();
		double resultado = c.somar(5, 5);
		assertEquals(10, resultado);
	}

	@Test
	@DisplayName("Teste de Subtrair")
	void testSubtrair() {
		System.out.println("Testando Subtrair !!!");
		Calculadora c = new Calculadora();
		double resultado = c.subtrair(5, 5);
		assertEquals(0, resultado);
	}

	@Test
	@DisplayName("Teste de Multiplicar")
	void testMultiplicar() {
		System.out.println("Testando Multiplicar !!!");
		Calculadora c = new Calculadora();
		double resultado = c.multiplicar(5, 5);
		assertEquals(25, resultado);
	}

	@Test
	@DisplayName("Teste de Dividir")
	void testDivisao() {
		System.out.println("Testando Dividir !!!");
		Calculadora c = new Calculadora();
		double resultado = c.dividir(5, 2);
		assertEquals(2.5, resultado);
	}

}
