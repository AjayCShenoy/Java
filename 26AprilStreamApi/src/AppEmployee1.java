import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AppEmployee1 {

	public static void main(String[] args) {

		List<Employee1>arr=new ArrayList<Employee1>();
		arr.add(new Employee1(100,"Ajay","C M","EEE",20000.0));
		arr.add(new Employee1(101,"Ajith","C M","EEE",25000.0));
		arr.add(new Employee1(102,"Bhagya","Lakshmi","CSE",21000.0));
		arr.add(new Employee1(103,"Arusha","Ann","CSE",24000.0));
		
		Map<String,Double> result=arr.stream()
		.collect(Collectors.groupingBy(Employee1::getDepartment,Collectors.summingDouble(Employee1::getSalary)));

		
	}

}
