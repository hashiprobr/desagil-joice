package br.edu.insper.desagil.joice.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class TestadorTest {
	private Testador t;

	@BeforeEach
	private void setUp() {
	    t = new Testador();
	}
	
	@Test
	public void testeNiobio() {
		assertEquals(8.89, t.testeNiobio(), 0.05);
	}
	
}
