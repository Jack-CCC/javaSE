package file;

import java.io.File;

public class FileDeleteDemo {
	public static void main(String[] args) {
		/*
		 * delete()删除文件/目录
		 * 若删除的目录还有下一级文件/目录，则删除失败
		 * 如果文件不存在，也删除失败
		 * 删除失败返回false
		 * 删除必须是从底层往上删
		 */
		File file = new File("dirOne");
		
		boolean flag = file.delete();
		
		System.out.println(flag);
		
		
	}

}
