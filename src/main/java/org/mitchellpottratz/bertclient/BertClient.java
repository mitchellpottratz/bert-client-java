
package org.mitchellpottratz.bertclient;


import java.util.Map;
import java.util.HashMap;

import net.dongliu.requests.Requests;



public class BertClient {
	private String endpoint;
	private int dims;


	public BertClient() {
		endpoint = "http://localhost:5556/encode";
		dims = 768;
	}

	/**
	 * 
	 * @param endpoint the url the bert server is listening for requests on
	 */
	public BertClient(String endpoint, int dims) {
		this.endpoint = endpoint;
		this.dims = dims;
	}

	/**
	 * 
	 * @param text the string to encode
	 * @return	the dense vector created from the text parameter 			
	 */
	public float[] encode(String text) {
		Map<String, Object> params = createURLParams(text);
		String responseBody = Requests.get(endpoint).params(params).send().readToText();

		float[] vector = parseStringToVector(responseBody);
		return vector;
	}  

	/**
	 * 
	 * @param param the query paramter for the endpoint, which is the string to encode		
	 * @return  a HashMap containing the paramerter 
	 * 				 
	*/
	private Map<String, Object> createURLParams(String param) {
		Map<String, Object> params = new HashMap<>();
		params.put("text", param);
		return params;
	}


	public float[] parseStringToVector(String string) {
		float[] vector = new float[dims];
		String[] stringArray = string.substring(1, string.length() - 1).split(",");

		for (int i = 0; i < stringArray.length; i++) {
			vector[i] = Float.parseFloat(stringArray[i]);
		}
		
		return vector;
	}


	/*
		* getters and setters 
	*/

	public String getEndpoint() {
		return endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}

	public int getDims() {
		return dims;
	}

	public void setDims(int dims) {
		this.dims = dims;
	}

}
