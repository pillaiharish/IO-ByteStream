package IO.ByteStream;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class BufferedOutputStreamDemo {
	
	public static void main(String[] args) {
		
		OutputStream outputStream = null ;
		BufferedOutputStream buf ;
		buf = new BufferedOutputStream(outputStream) ;
		String s = "This should end up in the array";
		byte[] bufbyte = s.getBytes();
		try {
			buf.write(bufbyte);
		} catch(IOException e) {
			System.out.println("Error Writing to Buffer");
			return;
		}
//		PrintStream ps = new PrintStream(buf);
//		ps.println();
	}

}
