package org.sid;

import org.sid.entity.Employee;
import org.sid.entity.EmployeeId;
import org.sid.entity.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CompositeApplication implements CommandLineRunner{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CompositeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//clear up all the tables
		employeeRepository.deleteAllInBatch();	
		
		//employee object
		Employee employee = new Employee(new EmployeeId("employeeId","companyId"), "name", "email", "phoneNumber" );
		employeeRepository.save(employee);
		
		//retrieve an employee with the composite key
		employeeRepository.findById(new EmployeeId("employeeId", "companyId"));
	}

}
