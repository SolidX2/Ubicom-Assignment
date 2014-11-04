package de.cmlab.ubicomp;

import java.util.*;
import org.apache.xmlrpc.*;

public class Client {
 public static void main (String [] args) {
  try {

     XmlRpcClient server = new XmlRpcClient("http://10.1.25.115:8080"); 
     Vector params = new Vector();
     params.addElement(new Integer(8));
     params.addElement(new Integer(3));

     Object result = server.execute("test.sum", params);

     int sum = ((Integer)result).intValue();
     System.out.println("The sum is: "+ sum);

   } catch (Exception exception) {
     System.err.println("JavaClient: " + exception);
   }
  }
}
    