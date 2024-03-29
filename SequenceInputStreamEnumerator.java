package IO.ByteStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStreamEnumerator implements Enumeration<FileInputStream> {
	private Enumeration<String> files;
	public SequenceInputStreamEnumerator(Vector<String> files) {
		this.files = files.elements();
	}
	public boolean hasMoreElements() {
		return files.hasMoreElements();
	}
	public FileInputStream nextElement() {
		try {
			return new FileInputStream(files.nextElement().toString());
		} catch (IOException e) {
			return null;
		}
	}
}
