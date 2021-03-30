package br.edu.insper.desagil.joice.model;

import static org.junit.jupiter.api.Assertions.*;

import br.edu.insper.desagil.joice.view.CalculadoraCFCView;

public class Testador {
	public double testeNiobio() {
		Calculadora calculadora = new CalculadoraCFC("cobre", 63.55, 0.128);
		double densidade = CalculadoraCFC.calcula(this.peso, this.raio);
		return densidade;
		}
		
}