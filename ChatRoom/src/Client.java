import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args)throws Exception {
		Scanner scan=new Scanner(System.in);
	    ServerSocket sersock = new ServerSocket(3000);
	      System.out.println("--Client--");
	      Socket sock = sersock.accept( );                          
	                              
	      BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
		                  
	      OutputStream ostream = sock.getOutputStream(); 
	      PrintWriter pwrite = new PrintWriter(ostream, true);
	 
	                             
	      InputStream istream = sock.getInputStream();
	      BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));
	 
	      String receiveMessage, sendMessage;               
	      while(true)
	      {
	        if((receiveMessage = receiveRead.readLine()) != null)  
	        {
	           System.out.println(receiveMessage);         
	        }         
	        sendMessage = keyRead.readLine(); 
	        pwrite.println(sendMessage);             
	        pwrite.flush();
	      }
}
}


