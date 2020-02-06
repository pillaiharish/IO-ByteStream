package IO.ByteStream;

import java.io.File;
import java.io.FilenameFilter;

class DirList {
	public static void main(String args[]) {
		String dirname = "C:/DEV/Preparation/Notes";//"C:\\DEV\\Preparation\\Notes";
		File f1 = new File(dirname);
		if (f1.isDirectory()) {
			System.out.println("Directory of " + dirname);
			String s[] = f1.list();
			for (int i=0; i < s.length; i++) {
				File f = new File(dirname + "/" + s[i]);
				if (f.isDirectory()) {
					System.out.println(s[i] + " is a directory");
				} else {
					System.out.println(s[i] + " is a file");
				}
			}
		} else {
			System.out.println(dirname + " is not a directory");
		}
		
		
		File f2 = new File(dirname);
		FilenameFilter only = new OnlyExt("pdf");
		String s[] = f1.list(only);
		for (int i=0; i < s.length; i++) {
		System.out.println(s[i]);
		}
		
	}
}
