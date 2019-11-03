package random_access_file;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Handler;

/**
 * 按字节读写来实现文件复制
 * @author Administrator
 *
 */
public class FileCopyDemo {
	
	public static void main(String[] args) throws IOException {
		
		RandomAccessFile raf = new RandomAccessFile("test.jpg", "r");
		
		//即使此文件不存在，也可以这样定义
		RandomAccessFile raf1 = new RandomAccessFile("test1.jpg", "rw");
		
		int d = -1;
		long start = System.currentTimeMillis();
		
		while((d = raf.read()) != -1) {
			raf1.write(d);
		}
		long end = System.currentTimeMillis();
		raf.close();
		raf1.close();
		System.out.println("用时" + (end-start) + "毫秒");
		
		
		
	}
	
}
