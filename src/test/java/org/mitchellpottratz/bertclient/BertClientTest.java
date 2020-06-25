package org.mitchellpottratz.bertclient;

import org.junit.Test;
import static org.junit.Assert.*;


public class BertClientTest {

	@Test
	public void testConstructors() {
		BertClient clientOne = new BertClient();
		BertClient clientTwo = new BertClient("http://104.197.11.222:8000");

		assertEquals("http://localhost:5556", clientOne.getEndpoint());
		assertEquals("http://104.197.11.222:8000", clientTwo.getEndpoint());
	}


}
