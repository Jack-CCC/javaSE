package string;
/**
 * String的API
 * @author Administrator
 *
 */
public class StringAPIDemo {
	public static void main(String[] args) {
		//length()获取字符串的长度，即获取底层的字符数组的长度
		String str1 = "China No.1";
		int len = str1.length();
		//trim()去掉字符串开头和结尾的空白
		String str2 = "  WWW,China No.1    ";
		String str3 = str2.trim();
		//charAt(int)获取指定索引处的字符
		char c = str1.charAt(1);//h
		
		//获取子字符串在字符串内第一次出现的下标,若不存在，返回-1
		int i1 = str2.indexOf("WW");//2
		int i2 = str2.indexOf("W",2);//2
		int i3 = str2.lastIndexOf("W");//4
		
		//获取子串
		String str4 = str2.substring(4);//W,China No.1    空格也被截取到了
		String str5 = str2.substring(7, 12);//hina 下标从0开始，且截取子串时含头不含尾
		
		//toUpperCase()将字符串中的英文转为大写
		String str6 = str2.toUpperCase();//  WWW,CHINA NO.1    
		
		//toLowerCase()将字符串中的英文转为小写
		String str7 = str2.toLowerCase();//  www,china no.1    
		
		//将其他类型的数据转换为String表示
		String str8 = String.valueOf(2.3);//"2.3"
		
		//判断字符串是否由……开头
		boolean flag = str2.startsWith("  WWW");//true
		
		//判断字符串是否由……结尾
		boolean flag1 = str2.endsWith("   ");//true
		
	}
}
