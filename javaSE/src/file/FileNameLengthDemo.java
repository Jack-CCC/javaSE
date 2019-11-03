package file;

import java.io.File;

/**
 * file.length()
 * 获取文件内容的字节量(long)
 * file.getName()
 * 获取文件名
 * @author Administrator
 *
 */
public class FileNameLengthDemo {
	public static void main(String[] args) {
		
		File file = new File("h.txt");
		
		String nameString = file.getName();
		
		System.out.println(nameString);
		
		long length = file.length();
		
		System.out.println(length);
		
		
	}
}	
