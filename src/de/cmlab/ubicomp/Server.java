package de.cmlab.ubicomp;

import java.util.Hashtable;

import org.apache.xmlrpc.WebServer;

public class Server {

	 public Integer sum(int x, int y) {
	    return new Integer(x+y);
	 }

	 public static void main (String [] args) {
	  try {

	     System.out.println("Attempting to start XML-RPC Server...");
	     WebServer server = new WebServer(8080);
	     server.addHandler("test", new Server());
	     server.start();
	     System.out.println("Started successfully.");
	     System.out.println("Accepting requests. (Halt program to stop.)");
	   } catch (Exception exception) {
	     System.err.println("JavaServer: " + exception);
	   }
	  }
	 }