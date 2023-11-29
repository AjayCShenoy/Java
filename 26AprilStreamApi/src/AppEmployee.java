import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AppEmployee {
	
	public static void main(String[]args) {
		List<Employee>arr=new ArrayList<Employee>();
		
		arr.add(new Employee(100,"Ajay","C M",20000.0));
		arr.add(new Employee(101,"Ajith","C M",25000.0));
		arr.add(new Employee(102,"Bhagya","Lakshmi",21000.0));
		arr.add(new Employee(103,"Arusha","Ann",24000.0));
		
		
//		filter arr using salary>20000
//		sort arr by salary
		
		List<Employee> result =arr.stream()
		.filter((a)->a.getSalary()>20000)
		.sorted((a,b)->(int)(a.getSalary()-b.getSalary()))
		.collect(Collectors.toList());
		
		for(Employee e:result)
		{
			System.out.println(e);
		}
		
	}
	
}
