package a;

import java.util.Scanner;

public class absvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���: ");
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
		System.out.printf("���� %d�� ���밪�� %s�Դϴ�.", x, b);
	}

}
