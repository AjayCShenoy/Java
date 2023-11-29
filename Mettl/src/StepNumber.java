import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StepNumber {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		String result=isStepNumber(input);
		if(result.equals("1"))
			System.out.println(input+ "-" + "true");
		else
			System.out.println(input+ "-" + "false");
		
	}
	private static String isStepNumber(int input) {
		List<Integer>list=new ArrayList<>();
		while(input>0) {
			int rem=input %10;
			list.add(rem);
			input=input/10;
		}
		if(list.size()==1)
			return "0";
		else
		{
			for(int i=0;i<list.size();i++) {
				if(list.get(i)-list.get(i+1)==1 ||list.get(i)-list.get(i+1)==-1) {
					return "1";
				}
				else
					return "0";
				
			}
		}
		
		
		
		return null;
	}
}
