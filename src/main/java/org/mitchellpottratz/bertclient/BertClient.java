
package org.mitchellpottratz.bertclient;


public class BertClient {
	private String endpoint;


	public BertClient() {
		endpoint = "http://localhost:5556";
	}

	/**
	 * 
	 * @param endpoint the url the bert server is listening for requests
	 */
	public BertClient(String endpoint) {
		this.endpoint = endpoint;
	}

	/**
	 * 
	 * @param text the string to encode
	 * @return	the dense vector create from the text parameter 			
	 */
	// public float[] encode(String text) {
		
	// }  

	/*
		* getters and setters 
	*/

	public String getEndpoint() {
		return endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}

}
