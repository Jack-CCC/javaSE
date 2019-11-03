package regex;
/**
 * 根据正则切割字符串为string数组
 * @author Administrator
 *
 */
public class StringSplitDemo {
	public static void main(String[] args) {
		String string = "黄河之水天上来，东流到海不复回。君不见，高堂明镜悲白发，后面的忘记了。";
		//中文逗号和英文逗号是容易出错的地方
		String[] strings1 = string.split("，");
		for(String str : strings1) {
			System.out.println(str);
		}
		//[]内的内容是或的关系[54]6只要满足是46，是56即可触发，546只有46触发
		String string2 = "5453 2647 8764 1254 7895 4568 5454 9684";
		String[] strings2 = string2.split("[54]6");
		for(String str : strings2) {
			System.out.println(str);
		}
		
	}
}
