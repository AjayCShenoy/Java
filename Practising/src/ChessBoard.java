import java.util.Scanner;

public class ChessBoard {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int arr[][]=new int [row][col];
		int flag=0;
		int count=0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++)
		{
//			 flag=0;
			for(int j=0;j<col-1;j++)
			{
				if(arr[i][j]==0 && arr[i][j+1]!=1) 
				{
					count++;
					flag=1;
					break;
				}
				
				if(arr[i][j]==1 && arr[i][j+1]!=0)
				{
					count++;
					flag=1;
					break;
				}	
			}
			if(flag==1) {
				break;
			}
		}
		if(flag==0) {	
			System.out.println("true");	
	}
	else {
		System.out.println("false");
		System.out.println(count);
	}	
  }
}
