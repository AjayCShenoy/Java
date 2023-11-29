import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StatesandCapitalsMain{

	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Map<String,String>map=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			map.put(sc.next(), sc.next());
		}
		String state=sc.next();
		String result=StatesandCapitals.getcapital(map,state);
		System.out.println(result);
	}
}
