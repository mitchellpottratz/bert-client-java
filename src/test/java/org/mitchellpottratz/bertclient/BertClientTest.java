package org.mitchellpottratz.bertclient;

import org.junit.Test;
import static org.junit.Assert.*;


public class BertClientTest {

	@Test
	public void testConstructors() {
		BertClient clientOne = new BertClient();
		BertClient clientTwo = new BertClient("http://104.197.11.222", 8000);

		assertEquals("http://localhost", clientOne.getHost());
		assertEquals(5556, clientOne.getPort());

		assertEquals("http://104.197.11.222", clientTwo.getHost());
		assertEquals(8000, clientTwo.getPort());
	}


}
