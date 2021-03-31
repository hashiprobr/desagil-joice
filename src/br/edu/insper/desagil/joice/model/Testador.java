package br.edu.insper.desagil.joice.model;

//import static org.junit.jupiter.api.Assertions.*;

//import br.edu.insper.desagil.joice.view.CalculadoraCFCView;

public class Testador {
	public double testeNiobio() {
		CalculadoraCFC calculadora = new CalculadoraCFC("CFC", 63.55, 0.128);
		double densidade = calculadora.calcula(calculadora.getPeso(), calculadora.getRaio());
		return densidade;
		}
		
}