package file;

import java.io.File;

public class MakeDirDemo {
	public static void main(String[] args) {
		/*
		 * mkdir()创建目录
		 * 如果目录已存在，则创建失败，返回false
		 */
		File file = new File("dirOne");
		
		boolean flag = file.mkdir();
		
		System.out.println(flag);
		
		//file.delete();
		
		/*
		 * mkdirs()创建多级目录
		 * 若多级目录已存在，则创建失败，返回false()
		 * 只要某一级目录不存在，则还是可以创建，并返回true
		 * 已存在dirOne/a/c目录，依旧可以创建dirOne/a/b/c/c，原有的c目录与新目录b在同一级
		 */
		file = new File("dirOne/a/b/c/c");
		
		flag = file.mkdirs();
		
		System.out.println(flag);	
		
	}
}
