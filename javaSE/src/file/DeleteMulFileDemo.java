package file;

import java.io.File;

/**
 * 删除某目录(该目录下还有子目录)，用到了递归
 * @author Administrator
 *
 */
public class DeleteMulFileDemo {
	public static void main(String[] args) {
		
		File file = new File("dirOne");
		
		deleteFile(file);
		
		
	}

	private static void deleteFile(File file) {
		
		//首先判断是否是文件
		if(file.isDirectory()) {
			//如果是目录，遍历其找到子目录与子文件，递归调用此方法
			File[] subfiles = file.listFiles();
			for(File f : subfiles) {
				deleteFile(f);
			}
		}
		//处理完子文件/目录后，可以直接删除此目录了
		file.delete();
		
	}
	
	
}
