package com.anahuac.calidad.app;

//import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat; 
import static org.hamcrest.Matchers.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.anahuac.calidad.app.Calculadora;


public class CalculadoraTest {

	private Calculadora miCalculadora;
	@Before
	public void setUp() throws Exception {
		miCalculadora = new Calculadora();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void SumaTest() {
		double resultadoEsperado = 4; //Setear el resultado esperado
		
		//El ejercicio del código a probar
		double resultadoEjecucion = miCalculadora.suma(2.0, 2.0);
		
		//Verificar
		//Assert.assertEquals(resultadoEsperado, resultadoEjecucion, .01);
		assertThat(resultadoEsperado,is(closeTo(resultadoEjecucion,.01)));
	}

	@Test(expected=ArithmeticException.class)
	public void divisionEnteraTest()
	{
		int resultadoEsperado = 2;
		int resultadoEjecucion = miCalculadora.divisionEntera(10,5);
		
		//Verificar
		//Assert.assertEquals(resultadoEsperado, resultadoEjecucion, .01);
		assertThat(resultadoEsperado,is(resultadoEjecucion));
		
	}
	
}
