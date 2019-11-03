package random_access_file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("h.txt", "rw");
		raf.write(97);//向h.txt中写入了'a'
		for(int i = 0; i<26; i++) {
			raf.write(97+i);
		}//向h.txt中写入26个字母,且没有覆盖掉之前写入的'a'
		raf.close();
	}
}
