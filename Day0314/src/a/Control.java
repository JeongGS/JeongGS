package a;

import java.util.Scanner;

public class Control {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 16, b= 11;
		int gender;
		Scanner giral = new Scanner(System.in);
		System.out.println("성별을 숫자로 입력하시오.");
		gender = giral.nextInt();
		
		if (gender ==2 || gender == 4)
		{
			System.out.println("여자");
		}
		else if (gender== 1 || gender ==3)
		{
			System.out.println("남자");
		}
		else
		{
			System.out.println("중성");
		}
		
		System.out.println("키를 입력해 주세요: ");
		float height = giral.nextFloat();
		System.out.println("키는 "+height);
		
		int score;
		Scanner sori = new Scanner(System.in);
		System.out.println("점수를 입력하시오.");
		score = sori.nextInt();
		
		if (score >=90)
		{
			System.out.println('수');
		}
		else if (score >=80)
		{
			System.out.println('우');
		}
		else if (score >=70)
		{
			System.out.println('미');
		}
		else if (score >=60)
		{
			System.out.println('양');
		}
		else
		{
			System.out.println('가');
		}
		
		if (score >= 60)
		{
			System.out.println("합격");
		}
		else
		{
			System.out.println("불합격");
		}

	}
}


