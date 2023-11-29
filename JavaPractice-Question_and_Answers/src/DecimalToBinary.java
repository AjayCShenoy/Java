
public class DecimalToBinary {

	public static long getBinary(int N) {
		int rem=1;
		int i=1;
		int binary=0;
		while(N>0)
		{
			rem=N%2;
			N=N/2;
			binary=binary+(rem*i);
			i=i*10;
			
		}
		return binary;
	}

}
