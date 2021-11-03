import java.util.HashSet;
import java.util.Set;

class Employee{
	private int id;
	private String name;
	private int age;
	private double salary;
	private String dept;
	
	
	public Employee(int id, String name, int age, double salary, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.dept = dept;
	}
	
	public boolean equals(Object o)
	{
		if(this==o)
		{
			return true;
		}
		if(o==null || getClass() !=o.getClass())
		{
			return false;
		}
		Employee e=(Employee) o;
		if(id!=e.id) {
			return false;
		}
		if(!name.equals(e.name))
		{
			return false;
		}
		if(age!=e.age)
		{
			return false;
		}
		if(salary!=e.salary)
		{
			return false;
		}
		if(dept!=e.dept)
		{
			return false;
		}
		return true;
	}
	
	public int hashCode()
	{
		int result=name.hashCode();
		int result1=dept.hashCode()+result;
		result1 = 31 * result1 + id+age;
        return result1;
	}
	
	 public String toString()
	    {
	        return "{" +
	                "name='" + name + '\'' +
	                ", age= " + age + " id= "+id+" salary= "+salary+" dept= "+dept+
	                '}';
	    }
	
}
public class GenericsQue1 {

	public static void main(String[] args) {
		Employee e1 = new Employee(1,"Anuj",22,25000,"MCA");
        Employee e2 = new Employee(2, "Parth",23,30000,"MCA");

        Set<Employee> getDetails = new HashSet<>();
        System.out.println("FIRST EMPLOYEE DETAILS");
        getDetails.add(e1);
        System.out.println(e1);
        System.out.println("SECOND EMPLOYEE DETAILS");
        getDetails.add(e2);
        System.out.println(e2);

	}

}
