package org.mitchellpottratz.bertclient;

import org.junit.Test;
import static org.junit.Assert.*;


public class BertClientTest {

	@Test
	public void testInstantiation() {
		BertClient clientOne = new BertClient();
		BertClient clientTwo = new BertClient("http://104.197.11.222:8000/encode", 768);

		// tests the endpoint property
		assertEquals("http://localhost:5556/encode", clientOne.getEndpoint());
		assertEquals("http://104.197.11.222:8000/encode", clientTwo.getEndpoint());

		// tests the dims property
		assertEquals(clientOne.getDims(), 768);
		assertEquals(clientTwo.getDims(), 768);
	}


}
