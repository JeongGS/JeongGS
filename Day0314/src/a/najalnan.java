package a;

public class najalnan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pythonS = 60;
		int javaS= 70;
		int androidS= 80;
		int cS = 50;
		int ccS = 30;
		int total = pythonS+javaS+androidS+cS+ccS;
		float ping = total / 5.0f;
		System.out.printf("나잘란의 성적 총합계는 %d입니다. 평균은 %.1f입니다.\n", total, ping);
		System.out.print("나잘난의 성적 총합계는 ");
		System.out.print(total);
		System.out.print("입니다. 평균은 ");
		System.out.print(ping);
		System.out.println("입니다.");

		int x =3;
		if (x%2 == 0)
			System.out.println("짝수");
		else
			System.out.println("홀수");
	}

}
