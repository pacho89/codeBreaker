package codebreaker;

import static org.junit.Assert.*;

import org.junit.Test;

public class codeBreakerTest {
	codeBreaker code;
	@Test
	public void testIsCorrect() {
		code= new codeBreaker();
		String resultado= code.adivinar("1234");
		assertEquals("XXXX", resultado);		
	}
	
	@Test
	public void testIsIncorrect() {
		code= new codeBreaker();
		String resultado= code.adivinar("0675");
		assertEquals("", resultado);		
	}

	@Test
	public void testNoPosition() {
		code= new codeBreaker();
		String resultado= code.adivinar("4321");
		assertEquals("____", resultado);		
	}
	
	@Test
	public void testMitiMiti() {
		code= new codeBreaker();
		String resultado= code.adivinar("4231");
		assertEquals("_XX_", resultado);		
	}
	@Test
	public void testMitiMiti2() {
		code= new codeBreaker();
		String resultado= code.adivinar("1243");
		assertEquals("XX__", resultado);		
	}	
	@Test
	public void testMitadMitiMiti() {
		code= new codeBreaker();
		String resultado= code.adivinar("1279");
		assertEquals("XX", resultado);		
	}
	
	@Test
	public void test7() {
		code= new codeBreaker();
		String resultado= code.adivinar("5689");
		assertEquals("", resultado);		
	}
	
	@Test
	public void test8() {
		code= new codeBreaker();
		String resultado= code.adivinar("56895");
		assertEquals("Falso", resultado);		
	}
	@Test
	public void test9() {
		code= new codeBreaker();
		String resultado= code.adivinar("568");
		assertEquals("Falso", resultado);		
	}
	@Test
	public void testisnumber() {
		code= new codeBreaker();
		String resultado= code.adivinar("abcd");
		assertEquals("Falso", resultado);		
	}

}
