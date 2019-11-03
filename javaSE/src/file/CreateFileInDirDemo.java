package file;

import java.io.File;
import java.io.IOException;

/**
 * 创建不存在的目录下的文件
 * 先创建多级目录
 * 再在目录下创建文件
 * @author Administrator
 *
 */
public class CreateFileInDirDemo {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("dirTwo/a/b");
		//先创建多级目录
		boolean flag = file.mkdirs();
		
		/*
		 * 在指定父目录下创建文件/目录：
		 * new File(File parent,String childFileName)
		 * new File(String parentDirName,String childFileName)
		 */
		//File childFile = new File(file, "z.txt");
		File file2 = new File("dirTwo/a/b","z.txt");
		
		flag = file2.createNewFile();
		
		System.out.println(flag);
		
		
	}
}
