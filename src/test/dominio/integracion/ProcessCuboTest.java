package dominio.integracion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dominio.ProcessCubo;

class ProcessCuboTest {

	@Test
	void test() {
		
		String in = "2\r\n" + 
	    		"4 5\r\n" + 
	    		"UPDATE 2 2 2 4\r\n" + 
	    		"QUERY 1 1 1 3 3 3\r\n" + 
	    		"UPDATE 1 1 1 23\r\n" + 
	    		"QUERY 2 2 2 4 4 4\r\n" + 
	    		"QUERY 1 1 1 3 3 3\r\n" + 
	    		"2 4\r\n" + 
	    		"UPDATE 2 2 2 1\r\n" + 
	    		"QUERY 1 1 1 1 1 1\r\n" + 
	    		"QUERY 1 1 1 2 2 2\r\n" + 
	    		"QUERY 2 2 2 2 2 2";
		
		String outEx = "4\n" + 
				"4\n" + 
				"27\n" + 
				"0\n" + 
				"1\n" + 
				"1\n";
		
		assertEquals(outEx, ProcessCubo.processInput(in.split("\r\n")));
	}

}
