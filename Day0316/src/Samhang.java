
public class Samhang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = -10;
		int absX;
		//int absX = x>=0?x:-x;
		//System.out.println("absX= "+absX);
		if (x < 0)
		{
			absX = x * -1;
		}
		else
		{
			absX = x;
		}
		System.out.println("absX: "+absX);
		char b ='d';
		int c = (int)b+1;
		char d = (char)c;
		System.out.println("d°ªÀº: "+d);
		char yy = 'y';
		char ysi = yy.toUpperCase();
		System.out.println(ysi);
	}

}
