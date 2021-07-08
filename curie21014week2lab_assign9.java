package curie;

public class curie21014week2lab_assign9 {

	public static void main(String[] args) {
		// swap
		float first=5.6f, second=3.3f;
		System.out.println("before swap");
		System.out.println("first is "+first);
		System.out.println("second is "+second);
		float temporary=first;
				first=second;
				second=temporary;
		System.out.println("after swap");
		
		System.out.println("first is "+first);
		System.out.println("second is "+second);
	}

}
