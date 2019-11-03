package random_access_file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;

/**
 * 使用字节数组方式读写复制文件
 * @author Administrator
 *
 */
public class FileCopyDemo2 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf = new RandomAccessFile("test.jpg", "r");
		RandomAccessFile raf1 = new RandomAccessFile("test2.jpg", "rw");
		byte[] data = new byte[1024 * 10];
		int len = -1;
		long start = System.currentTimeMillis();
		while((len = raf.read(data)) != -1) {
			raf1.write(data,0,len);
		}
		long end = System.currentTimeMillis();
		
		raf.close();
		raf1.close();
		System.out.println("共用时" + (end - start) + "毫秒");
		
		
	}
}
