package example;

public class Op2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte flag1  = 0b00000100;
		byte result = 0b00000000;
		System.out.println(~flag1);
		
		System.out.println(Integer.toBinaryString(flag1));		
		System.out.println(Integer.toBinaryString(~flag1));
		
		int x = -10;
		int absX = x >= 0 ?x: -x;
		System.out.println(absX);
		
		int score =50;
		char grade = score >=90? 'A': (score >= 80? 'B': 'C');
		System.out.println(!(3/2==1));
		
	}
}
