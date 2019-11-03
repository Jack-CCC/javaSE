package integer;

public class ParseIntDemo {
	public static void main(String[] args) {
		//将String类型转为int(前提是这个字符串是数字)
		//否则出现异常 java.lang.NumberFormatException
		int i = Integer.parseInt("123");
		System.out.println(i);
	}

}
