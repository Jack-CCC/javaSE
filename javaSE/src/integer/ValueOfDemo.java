package integer;

public class ValueOfDemo {
	public static void main(String[] args) {
		//从jdk1.5开始实现了自动拆装箱，例如Integer in = 3；在底层会自动编译为Integer in = Integer.valueOf(3);
		//装箱
		int i = 3;
		Integer integer = Integer.valueOf(i);
		System.out.println(integer);
		
	}
}
