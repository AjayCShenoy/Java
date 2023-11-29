import java.util.Scanner;

public class MatrixcolrowSum {
	public static void main(String[]args)
	{
		
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		int col=sc.nextInt();
		int[][]mat=new int [rows] [col];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				mat[i][j]=sc.nextInt();
			}
		}
//		for(int i=0;i<rows;i++)
//		{
//			for(int j=0;j<cols;j++)
//			{
//				System.out.print(mat[i][j]+" ");
//			}
//			System.out.println();
//	}
		for(int i=0;i<rows;i++)
		{
			int rowsum=0;
			for(int j=0;j<col;j++)
			{
				
				rowsum+=mat[i][j];
				
			}
			System.out.print(rowsum+" ");
		}
		System.out.println();
		for(int j=0;j<col;j++) 
		{
			int colsum=0;
			for(int i=0;i<rows;i++) {
				
				colsum+=mat[i][j];
			}
			System.out.print(colsum+" ");
		}	
	}
}
