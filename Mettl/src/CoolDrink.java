import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CoolDrink {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int noOfShops=sc.nextInt();
		int price[]=new int[noOfShops];
		for(int i=0;i<noOfShops;i++)
		{
			price[i]=sc.nextInt();
		}
		int noOfDays=sc.nextInt();
		int money[]=new int[noOfDays];
		for(int i=0;i<noOfDays;i++)
		{
			money[i]=sc.nextInt();
		}
		int [] result=findNoofShops(noOfShops,price,noOfDays,money);
		System.out.println(Arrays.toString(result));
	}
	private static int[] findNoofShops(int noOfShops, int[] price, int noOfDays, int[] money) {
		
		List<Integer>list=new ArrayList<>();
		for(int i=0;i<noOfDays;i++) {
			int count=0;
			for(int j=0;j<noOfShops;j++) {
				if(money[i]>=price[j]) {
					count++;
				}
			}
			list.add(count);
		}
		int []arr=list.stream()
				.mapToInt(i->i).toArray();
		return arr;
	}
}
