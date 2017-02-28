package BusinessLayer;

import java.util.HashSet;

import java.util.Set;

/**
 * 
 * @author ayoub ghayati
 *
 */
public class Salary {
private Set<Employee> employees= new HashSet<Employee>();
	
	public void addEmployee(Employee emp)
	{
		employees.add(emp);

	}
	
	
	public float newSalary(int id, int pourcent){
		
		Employee emp = null;
	
		
		for( Employee e : employees){
			
			if(e.getId()==id){
				emp=e;
			}
			
		}
			
		Float bruteSalary= emp.getSalary();
		
		bruteSalary=bruteSalary+ (pourcent*bruteSalary)/100 ;
		
		emp.setSalary(bruteSalary);
			
		return bruteSalary;
	}
	
	
}
