package a;

import java.util.Scanner;

public class Control {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 16, b= 11;
		int gender;
		Scanner giral = new Scanner(System.in);
		System.out.println("������ ���ڷ� �Է��Ͻÿ�.");
		gender = giral.nextInt();
		
		if (gender ==2 || gender == 4)
		{
			System.out.println("����");
		}
		else if (gender== 1 || gender ==3)
		{
			System.out.println("����");
		}
		else
		{
			System.out.println("�߼�");
		}
		
		System.out.println("Ű�� �Է��� �ּ���: ");
		float height = giral.nextFloat();
		System.out.println("Ű�� "+height);
		
		int score;
		Scanner sori = new Scanner(System.in);
		System.out.println("������ �Է��Ͻÿ�.");
		score = sori.nextInt();
		
		if (score >=90)
		{
			System.out.println('��');
		}
		else if (score >=80)
		{
			System.out.println('��');
		}
		else if (score >=70)
		{
			System.out.println('��');
		}
		else if (score >=60)
		{
			System.out.println('��');
		}
		else
		{
			System.out.println('��');
		}
		
		if (score >= 60)
		{
			System.out.println("�հ�");
		}
		else
		{
			System.out.println("���հ�");
		}

	}
}


