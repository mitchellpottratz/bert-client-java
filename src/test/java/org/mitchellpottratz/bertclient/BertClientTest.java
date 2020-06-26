package org.mitchellpottratz.bertclient;

import org.junit.Test;
import static org.junit.Assert.*;


public class BertClientTest {

	@Test
	public void testInstantiation() {
		BertClient clientOne = new BertClient();
		BertClient clientTwo = new BertClient("http://104.197.11.222:8000/encode");

		assertEquals("http://localhost:5556/encode", clientOne.getEndpoint());
		assertEquals("http://104.197.11.222:8000/encode", clientTwo.getEndpoint());
	}


	@Test 
	public void testEncoding() {
		BertClient client = new BertClient("http://104.197.11.222:8000/encode");
		float[] vector = client.encode("hello world");

		assertEquals(vector.length, 768);
	}


}
