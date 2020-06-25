
package org.mitchellpottratz.bertclient;


public class BertClient {
	private String host;
	private int port;


	public BertClient() {
		host = "http://localhost";
		port = 5556;
	}

	/**
	 * 
	 * @param host the host the bert server is running on
	 * @param port the port the bert server is running on
	 */
	public BertClient(String host, int port) {
		this.host = host;
		this.port = port;
	}


	/*
		* getters and setters 
	*/

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

}
