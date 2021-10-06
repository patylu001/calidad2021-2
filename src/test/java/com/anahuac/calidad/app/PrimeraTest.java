package com.anahuac.calidad.app;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PrimeraTest {

	@Before
	public void setUp() throws Exception {
		System.out.println("Este es el before");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Este es el after");
	}

	@Test
	public void Primeratest() {
		System.out.println("Este es el primerTest");
		fail("Not yet implemented");
	}

	@Test
	public void Segundatest() {
		System.out.println("Este es el segundoTest");
		fail("Not yet implemented");
	}
	
	@Test
	public void Terceratest() {
		System.out.println("Este es el tercerTest");
		fail("Not yet implemented");
	}
	
	public void otroMetodo()
	{
		System.out.println("Hola");
	}
}
