
package org.mitchellpottratz.bertclient;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;


public class BertClient {
	private String endpoint;


	public BertClient() {
		endpoint = "http://localhost:5556/encode";
	}

	/**
	 * 
	 * @param endpoint the url the bert server is listening for requests on
	 */
	public BertClient(String endpoint) {
		this.endpoint = endpoint;
	}

	/**
	 * 
	 * @param text the string to encode
	 * @return	the dense vector created from the text parameter 			
	 */
	public void encode(String text) {
		String requestURL = addURLParam(text);
		System.out.println("requestURL: " + requestURL);

	}  

	/**
	 * 
	 * @param param the query paramter for the endpoint, 
	 * 							which is the string to encode
	 * @return the endpoint with the text to encode as 
	 * 				 a query parameter
	*/
	private String addURLParam(String param) {
		StringBuilder url = new StringBuilder(endpoint);
		url.append("?text=");
		url.append(param);
		return url.toString();
	}

  
	// private String executeRequest(String requestURL) {
	// 	CloseableHttpResponse response;

	// 	try {
	// 		CloseableHttpClient httpClient = HttpClients.createDefault();
	// 		HttpGet httpGet = new HttpGet(requestURL);
	// 		response = httpClient.execute(httpGet);
	// 		HttpEntity entity = response.getEntity();

	// 	} catch (IOException e) {
	// 		System.out.println("IOException: " + e);

	// 	} finally {
	// 		response.close();
	// 	}
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
