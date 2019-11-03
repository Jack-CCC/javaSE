package file;

import java.io.File;
/**
 * isFile()是否文件
 * isDirectory()是否目录
 * 当文件不存在时，也返回false
 * @author Administrator
 *
 */
public class IsFileDemo {
	public static void main(String[] args) {
		
		File file = new File("h.txt");
		
		boolean flag = file.isFile();
		
		System.out.println(flag);
		
		file = new File("dirOne/a/b");
		
		flag = file.isDirectory();
		
		System.out.println(flag);
		
	}
}
