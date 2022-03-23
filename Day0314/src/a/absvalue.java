package a;

import java.util.Scanner;

public class absvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요: ");
		int x = sc.nextInt();
		int b;
		if (x < 0)
		{
			b = x * -1;
		}
		else
		{
			b= x;
		}
		System.out.printf("정수 %d의 절대값은 %s입니다.", x, b);
	}

}
