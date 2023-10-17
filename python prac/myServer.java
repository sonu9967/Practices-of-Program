// Server2 class that 
// receives data and sends data 

import java.io.*; 
import java.net.*; 

class myServer { 

	public static void main(String args[]) 
		throws Exception 
	{ 

		// Create server Socket 
		ServerSocket ss = new ServerSocket(888); 

		// connect it to client socket 
		Socket s = ss.accept(); 
		System.out.println("Connection established"); 

		// to send data to the client 
		PrintStream ps 
			= new PrintStream(s.getOutputStream()); 

		// to read data coming from the client 
		BufferedReader br 
			= new BufferedReader( 
				new InputStreamReader( 
					s.getInputStream())); 

		// to read data from the keyboard 
		BufferedReader kb 
			= new BufferedReader( 
				new InputStreamReader(System.in)); 

		// server executes continuously 
		while (true) { 

			String str, str1; 

			// repeat as long as the client 
			// does not send a null string 

			// read from client 
			while ((str = br.readLine()) != null) { 
				System.out.println(str); 
				str1 = kb.readLine(); 

				// send to client 
				ps.println(str1); 
			} 

			// close connection 
			ps.close(); 
			br.close(); 
			kb.close(); 
			ss.close(); 
			s.close(); 

			// terminate application 
			System.exit(0); 

		} // end of while 
	} 
} 












































// import java.io.*;  
// import java.net.*;  
// public class myServer {  
// public static void main(String[] args){  
// try{  
// ServerSocket ss=new ServerSocket(6666);  
// Socket s=ss.accept();//establishes connection   
// DataInputStream dis=new DataInputStream(s.getInputStream());  
// String  str=(String)dis.readUTF();  
// System.out.println("message= "+str);  
// ss.close();  
// }catch(Exception e){
//     System.out.println(e);
// }  
// }  
// }  