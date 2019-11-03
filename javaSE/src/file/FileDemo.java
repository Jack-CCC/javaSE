package file;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		/*
		 * pathname有两种，相对路径和绝对路径
		 * 建议使用相对路径，可以忽略不同操作系统之间的路径差距
		 * 这里../已经在项目文件夹同级创建了一个h.txt,使用./创建了与src文件夹同级的h.txt
		 */
		File file = new File("./h.txt");
		
		//创建文件，如果文件存在，返回false
		boolean flag = file.createNewFile();
		System.out.println(flag);
	}
}
