package file;

import java.io.File;
import java.io.IOException;

public class FileExistsDemo {
	public static void main(String[] args) throws IOException {
		
		File file = new File("./h.txt");
		//file.exists()判断文件是否存在，若存在，返回true
		if (file.exists()) {
			System.out.println("文件已存在");
		}else {
			file.createNewFile();
			System.out.println("文件已创建");
		}
	}
}
