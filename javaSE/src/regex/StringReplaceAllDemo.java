package regex;

import java.util.Scanner;

/**
 * 示例：使用某字符串覆盖字符串A中满足正则的地方
 * @author Administrator
 *
 */
public class StringReplaceAllDemo {
	public static void main(String[] args) {
		String regex = "cnm|nm|sb";
		String string = new Scanner(System.in).nextLine();
		String stringB = "*";
		//string本身没有变化，这个方法返回结果是处理后的String对象，可以接收
		System.out.println(string.replaceAll(regex, stringB));
		
		
	}
}
