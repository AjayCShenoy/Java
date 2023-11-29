import java.lang.reflect.Method;

public class EmployeeApp {
	public static void main(String[] args) {

	Employee e1=new Employee();
	Class c=e1.getClass();
	Method[] methods=c.getMethods();
	for (Method m:methods) {
		System.out.println(m.getName());
	}
		}
}
