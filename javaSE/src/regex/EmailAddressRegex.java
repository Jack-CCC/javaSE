package regex;

import java.util.Scanner;

public class EmailAddressRegex {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//邮箱通常是字符串@字符串.字符串.字符串
		String regexString = "\\w+@\\w+(\\.\\w+)+";
		
		String string = scanner.nextLine();
		
		boolean flag = string.matches(regexString);
		
		System.out.println(flag);
		
		scanner.close();
		
	}
}
