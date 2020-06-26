
package org.mitchellpottratz.bertclient;


public class Main {

  public static void main(String[] args) {
    BertClient client = new BertClient("http://104.197.11.222:8000");
    client.encode("hello world");

  }

}