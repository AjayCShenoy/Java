import java.util.Scanner;
class DenominatorException extends Exception {
	public DenominatorException(String message) {
		super(message);
	}
	}
	
public class ExceptionExample1 {

	public static float calculatePercentage(int x,int y)throws DenominatorException{
			
		if(y>x|| y==8)
		{

	 throw new DenominatorException ("x should be >   y");
		}
		return (float)x/y;
		}

	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		try {
			float result=calculatePercentage(x, y);
			System.out.println(result);
			
		}
		catch (DenominatorException e) {
			System.out.println(e.getMessage());
			
			
		}
		
		System.out.println("program completed");
		
		}
	}

