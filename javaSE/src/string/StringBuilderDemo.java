package string;

public class StringBuilderDemo {
	public static void main(String[] args) {
		String str = "a";
		
		//builder对象中初始化内容为空字符串
//		StringBuilder builder = 
//			new StringBuilder();
		//builder对象中初始化内容为“a”
		StringBuilder builder2 = 
				new StringBuilder(str);//value是StringBuilder，第一位是a，后15位为空
		
		/*
		 * 在str基础上追加字符串
		 */            
		builder2.append("helloworld");
		String dest = builder2.toString();//ahelloworld拼接成功
		System.out.println(dest);
		
		/*
		 * delete(int start,int end)
		 * 删除从start开始到end结束的字符
		 * 包头不包尾
		 */
		builder2.delete(1, 6);
		dest = builder2.toString();//aworld
		System.out.println(dest);
		
		/*
		 * insert(int index,String str)
		 * 将给定的字符串插入到index位置
		 * aworld-->amy in the world
		 * 
		 */
		builder2.insert(1, "my in the ");
		dest = builder2.toString();
		System.out.println(dest);
		
		
		/*
		 * replace(int start,int end,String replacement)
		 * 使用给定的字符串替换start-end之间的字符串
		 * amy in the world-->amy and jack world
		 * 0123456789
		 */
		builder2.replace(4, 10, "and jack");
		dest = builder2.toString();
		System.out.println(dest);
		
		/*
		 * reverse()
		 * 对StringBuilder中的内容进行反转
		 */
		StringBuilder builder = 
					new StringBuilder("abcdef");
		builder.reverse();
		dest = builder.toString();
		System.out.println(dest);
		
		/*
		 * 回文判断--reverse()
		 */
		String input = "上海来水来自海上";
		StringBuilder builder3 = 
					new StringBuilder(input);
		builder3.reverse();
		String reverseStr = builder3.toString();
		
		//比较input和reverseStr的内容是否相等,使用equals
		if(input.equals(reverseStr)) {
			System.out.println("是回文");
		}else {
			System.out.println("不是回文");
		}
		
		
		
	}
}
