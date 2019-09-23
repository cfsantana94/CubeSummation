package dominio.unitaia;

import static org.junit.Assert.*;

import java.math.BigInteger;

import org.junit.Test;

import dominio.Cubo;

public class CuboTest {

	Cubo cuboTest = new Cubo();

	@Test
	public void testUpdate() {
		int value;
		value = cuboTest.update(1, 2, 1, 5);
		assertEquals(value, 5);
	}

	@Test
	public void testQuery() {
		BigInteger sum;
		BigInteger sum1 = new BigInteger("3");
		cuboTest.hm.put("1 1 1", 3);
		sum = cuboTest.query(1, 1, 1, 2, 2, 2);
		assertEquals(sum, sum1);
	}
	
	@Test
	public void testUpdateError() {
		int value;
		value = cuboTest.update(1, 2, 1, 5);
		assertNotEquals(value, 6);
	}
	
	@Test
	public void testQueryerror() {
		BigInteger sum;
		BigInteger sum1 = new BigInteger("8");
		cuboTest.hm.put("1 1 1", 3);
		sum = cuboTest.query(1, 1, 1, 2, 2, 2);
		assertNotEquals(sum, sum1);
	}

}
