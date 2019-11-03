package regex;

import java.util.Scanner;
public class ScannerDemoClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int i1 = scanner.nextInt();
		System.out.println(i1);
		
		//输入数字后的回车会被系统认为是输入了"\n"字符串
		String string = scanner.nextLine();
		System.out.println(string);
		
		int i = scanner.nextInt();
		System.out.println(i);
		//Scanner也要记得关闭
		scanner.close();
		
	}
}
