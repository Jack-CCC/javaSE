package string;
/**
 * String特性
 * @author Administrator
 *
 */
public class StringDemo {
	public static void main(String[] args) {
		//新建一个String对象
		String str0 = "first";
		//String类常用构造
		String str1 = new String("abc");
		String str2 = new String(new char[] {'a','b','c'});
		//字面量形式创建的String对象，无法被构造器创建对象时复用；构造器创建的字符串对象，也无法在字面量创建对象时复用。
		String str3 = "abc";
		//System.out.println(str1==str3);//false
		String str4 = "abc";
		//System.out.println(str3==str4);//true
		String str5 = new String("abc");
		//System.out.println(str4==str5);//false
		
		
		//字符串对象的拼接
		//字符串字面量的拼接，在编译期被优化成了拼接后的结果
		String str6 = "ab";
		String str7 = "a" + "b";
		System.out.println(str6==str7);//true
		//字符串变量的拼接，在拼接时，底层new了一个新对象。
		String str8 = "a";
		String str9 = str8 + "b";
		System.out.println(str9==str6);//false
		
		
	}
}
