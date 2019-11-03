package random_access_file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileReadDemo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("h.txt", "r");
		int i = raf.read();
		System.out.println(i);
		i = raf.read();
		System.out.println(i);
		i = raf.read();
		System.out.println(i);
		
		raf.close();
		
	}
}
