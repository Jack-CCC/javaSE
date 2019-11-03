package file;

import java.io.File;
import java.io.FileFilter;

/**
*file.listFiles(FileFilter)
 * 带过滤器的查询子文件/子目录
 * @author Administrator
 *
 */
public class ListFilesFilterDemo {
	public static void main(String[] args) {
		
		File file = new File(".");
		
		//匿名内部类方式的过滤器
		FileFilter fileFilter = new FileFilter() {
			
			@Override
			public boolean accept(File file) {
				//过滤得到以.开头文件名的文件(非目录)
				boolean flag1 = file.isFile();
				boolean flag2 = file.getName().startsWith(".");
				return flag1&&flag2;
			}
		};
		
		File[] childFiles = file.listFiles(fileFilter);
		
		for(File f : childFiles) {
			System.out.println(f.getName());
		}
		
	}
}
