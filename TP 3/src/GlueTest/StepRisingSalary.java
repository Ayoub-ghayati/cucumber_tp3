package GlueTest;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;


import BusinessLayer.Employee;

import BusinessLayer.Salary;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * 
 * @author ayoub ghayati
 *
 */
public class StepRisingSalary {
	Salary salaries= new Salary();
	Float salary;
	
	@Given("^le systeme de gestion des salaires est initalise comme suit$")
	public void le_systeme_de_gestion_des_salaires_est_initalise_comme_suit(DataTable employees) throws Throwable {
		
		Employee employee;
		List<Map<String, String>> dataSet = employees.asMaps(String.class, String.class);
		for (Map row : dataSet)
		{ 
			String id = row.get("id").toString();
			String user = row.get("user").toString();
			String sal=row.get("salaire").toString();
			employee=new Employee(Integer.parseInt(id),user,Float.parseFloat(sal)); 
			salaries.addEmployee(employee);
		} 

		
	}

	@When("^le directeur augmente le salaire de employee avec id (\\d+) par (\\d+) %$")
	public void le_directeur_augmente_le_salaire_de_employee_avec_id_par(int id, int pourcent) throws Throwable {
		
		salary= salaries.newSalary(id, pourcent);
		
		
	}

	@Then("^le Salaire de employee avec id ?(\\d+)? sera (\\d+)$")
	public void le_Salaire_de_employee_avec_id_sera(int id,int salary) throws Throwable {
		
		assertEquals(this.salary,salary,0);

		
	}

}
