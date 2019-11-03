package regex;

public class BorderMatchDemo {
	public static void main(String[] args) {
		//w可以是字符，数字，下划线
		//W表达与//w相反的取值区域，\d,\s也有\D,\S相对应
		// \s表示空格，\S表示非空格符
		String regex = "\\S{8,10}";
		String string = "a$$$$$$$$";
		
		boolean flag = string.matches(regex);
		System.out.println(flag);
		
		
	}
}
