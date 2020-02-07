import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class User {
public static void main(String[] args) throws IOException{
		Scanner scan=new Scanner(System.in);
		 Socket sock = new Socket("localhost", 3000);
       
		 BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
      
		 OutputStream ostream = sock.getOutputStream(); 
		 PrintWriter pwrite = new PrintWriter(ostream, true);

    
		 InputStream istream = sock.getInputStream();
		 BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));

		 System.out.println("--User--");

		 String receiveMessage, sendMessage;               
		 while(true)
		 {
			 sendMessage = keyRead.readLine(); 
			 pwrite.println(sendMessage);       
			 pwrite.flush();                    
			 if((receiveMessage = receiveRead.readLine()) != null) 
			 {
				 System.out.println(receiveMessage); 
			 }         
}}}


