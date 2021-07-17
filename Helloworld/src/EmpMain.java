
class Employee {
	int empno;
	double salary;
	String name;
	public int increasesalary;
	public void Increaseslary(double bonus) {
		double newsalary;
		newsalary = salary+bonus;
		System.out.println(newsalary);
	}
}
public class EmpMain{
	public static void Main(String arg[]) {
		Employee e= new Employee();
		e.salary =10000;
		e.increasesalary = 2000;
	}
}