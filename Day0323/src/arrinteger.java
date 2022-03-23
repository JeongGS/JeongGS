
public class arrinteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arri;
		int i, sum = 0;
		arri = new int[100];
		for (i=1; i<=100; i++)
		{
			arri[i-1] = i;
			sum += arri[i-1];			
		}

		System.out.println(sum);
	}

}
