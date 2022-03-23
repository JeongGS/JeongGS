package example;

public class TypeMismatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte flag1=0b00010001;
		System.out.println(Integer.toBinaryString(flag1));
		int x = -10;
		int absX = (x >= 0 ?x: -x);
		System.out.println(absX);
	}

}
