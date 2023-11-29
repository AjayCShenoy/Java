import java.util.Scanner;

public class HistoricalEra {
	public static void main (String[]args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int era=(x/100)+1;
		System.out.println(era);
		if (era>=0 && era<=2) {
			System.out.println("Prehistorical period");
		}
		else if(era<=6) {
			System.out.println("Vedic Period");
		}
		else if(era<=13) {
			System.out.println("Second Urbanisation");
		}
		else if(era<=18) {
			System.out.println("Early Modern Period");
		}
		else 
			System.out.println("Modern period");
	}

}
