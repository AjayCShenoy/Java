import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScoreArrayProblem {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int score=0;
		List<Integer>list=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			list.add(sc.nextInt());
		}
		
		for(int i=0;i<n-2+1;i++)
		{
			if((list.get(i)+list.get(i+1))%2==0)
					{
					score+=5;
					}
		}
		for(int j=0;j<n-3+1;j++)
		{
			int x=list.get(j)+list.get(j+1)+list.get(j+2);
			int y=list.get(j)*list.get(j+1)*list.get(j+2);
			if(x%2!=0 && y%2==0) {
				score+=10;
			}
		}
		System.out.println(score);
	}
}
