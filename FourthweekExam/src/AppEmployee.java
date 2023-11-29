import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class AppEmployee {

	public static void main(String[] args) {
		List<Employee>arr=new ArrayList<>();
		
		arr.add(new Employee(100,"Ajay","EEE",20000.0));
		arr.add(new Employee(101,"Ajith","EEE",25000.0));
		arr.add(new Employee(102,"Bhagya","CSE",21000.0));
		arr.add(new Employee(103,"Arusha","CSE",24000.0));
		
//		FIND DEPT WISE AVG SALARY
		Map<String, Double>result=arr.stream()

.collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
		
		for(Entry<String,Double>e:result.entrySet())

	    System.out.println(e);
	}

}
