package regex;

import java.util.Scanner;

public class PhoneNumberRegex {
	public static void main(String[] args) {
		//电话号码通常是11位，开头是13，15，17，18
		String regex = "1[3578]\\d{9}";
		Scanner scanner = new Scanner(System.in);
		String phoneNumString = scanner.nextLine();
		
		
		
		//升级版:前缀加上0086或者+86
		String regex1 = "(0086|\\+86)\\s1[3578]\\d{9}";
		
		boolean flag = phoneNumString.matches(regex1);
		System.out.println(flag);
		scanner.close();
		
	}
}
