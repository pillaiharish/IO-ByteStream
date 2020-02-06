package IO.ByteStream;

import java.io.ByteArrayInputStream;

class ByteArrayInputStreamDemo {
	public static void main(String args[]) {
		String tmp = "abc";
		byte b[] = tmp.getBytes();
		ByteArrayInputStream in = new ByteArrayInputStream(b);
		for (int i=0; i<2; i++) {
			int c;
			while ((c = in.read()) != -1) {
				if (i == 0) {
				System.out.print((char) c);
				} else {
				System.out.print(Character.toUpperCase((char) c));
				}
			}
			System.out.println();
			in.reset();
		}
		
		int a = in.available();
		for (int i=0; i<a; i++) {
			System.out.print((char) in.read());
		}		
		
		System.out.println();
		
		String tmp1 = "abcdefghijklmnopqrstuvwxyz";
		byte b1[] = tmp1.getBytes();
		ByteArrayInputStream input1 = new ByteArrayInputStream(b1,0,4);
		int d;
		while ((d = input1.read()) != -1)System.out.print((char) d);
				
	}
}