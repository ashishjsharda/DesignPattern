package test;
import java.util.ArrayList;
import java.util.List;

/**
 * Composite Design Pattern
 * @author ashish
 *
 */
class Employee
{
	private String name;
	private int sal;
	private String dept;
	List<Employee> subordinates=new ArrayList<Employee>();
	
	//Constructor
	public Employee(String name,int sal,String dept)
	{
		this.name=name;
		this.sal=sal;
		this.dept=dept;
		
	}
	
	/**
	 * Add Employee
	 * @param emp
	 */
	public void addEmployee(Employee emp)
	{
		subordinates.add(emp);
	}
	
	/**
	 * Get List of all Employees
	 * @return List<Employee>
	 */
	public List<Employee> getEmployee()
	{
		return subordinates;
	}
	
	/**
	 * Get Name
	 * @return String
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * Get Department
	 * @return String
	 */
	public String getDep()
	{
		return dept;
	}
	
	/**
	 * Get Salary
	 * @return int
	 */
	public int getSalary()
	{
		return sal;
	}
}
public class CompositePatternDemo {

	public static void main(String[] args) {
		
		Employee ceo=new Employee("Ashish",100000,"All");
		Employee vp=new Employee("Arun",30000,"Technology");
		Employee dir=new Employee("Jim",20000,"Technology");
		Employee seniorManager=new Employee("Ed",15000,"Technology");
		Employee manager=new Employee("Joe",12500,"Technology");
		ceo.addEmployee(vp);
		vp.addEmployee(dir);
		vp.addEmployee(seniorManager);
		vp.addEmployee(manager);
		for(Employee e:ceo.getEmployee())
		{
			System.out.println("Name is " +e.getName() +"  Department Name is "+  e.getDep() + "  Salary is "+e.getSalary());
			for(Employee head:vp.getEmployee())
			{
				System.out.println("Name is " +head.getName() +"  Department Name is "+  head.getDep() + "  Salary is "+head.getSalary());
			}
		}

	}

}
