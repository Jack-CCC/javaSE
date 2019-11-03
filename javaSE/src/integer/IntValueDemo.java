package integer;

public class IntValueDemo {
	public static void main(String[] args) {
		//拆箱
		Integer integer = new Integer(12);
		int i = integer.intValue();
		System.out.println(i);
		
		Double double1 = new Double(3.4);
		double d = double1.doubleValue();
		System.out.println(d);
		
	}

}
