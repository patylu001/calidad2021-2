package com.anahuac.calidad.app;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculadoraParamTest {

	private double arg1;
	private double arg2;
	private double result;
	private Calculadora miCalculadora;
	public CalculadoraParamTest(double arg1, double arg2, double result)
	{
		this.arg1 = arg1;
		this.arg2 = arg2;
		this.result = result;
	}
	
	@Parameters
	public static Collection<Object[]> data()
	{
		return Arrays.asList(new Object[][]{
			{2,2,44},
			{5,6,114},
			{10,10,240}
		});
	}
	
	@Before
	public void setUp() throws Exception {
		miCalculadora = new Calculadora();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void SumaTest() {
		
		double resultadoEjecucion = miCalculadora.suma(arg1, arg2);
		
		//Verificar
		//Assert.assertEquals(resultadoEsperado, resultadoEjecucion, .01);
		assertThat(result,is(closeTo(resultadoEjecucion,.01)));
	}

}
