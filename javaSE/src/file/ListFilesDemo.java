package file;

import java.io.File;

/**
 * listFiles()
 * 获取当前目录下的子文件/目录,只能获取到本层目录的下一层
 * @author Administrator
 *
 */
public class ListFilesDemo {
	public static void main(String[] args) {
		
		//创建文件对象，表示当前项目
		File file = new File(".");
		
		File[] childrenFilesFile = file.listFiles();
		
		for(File f : childrenFilesFile) {
			System.out.println(f.getName());
		}
		
	}
}
