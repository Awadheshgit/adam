package org.stacktrace;

import java.io.File;
import java.util.HashMap;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class DriverClass {

	@Test
	public void testEmployee() throws JAXBException {

		HashMap<Integer, Employee> map = new HashMap<Integer, Employee>();

		Employee employee1 = new Employee();
		employee1.setId(1001);
		employee1.setFirstName("adam");
		employee1.setLastName("j");
		employee1.setIncome(500000);

		Employee emp2 = new Employee();
		emp2.setId(2);
		emp2.setFirstName("John");
		emp2.setLastName("Mclane");
		emp2.setIncome(200.0);

		map.put(1001, employee1);
		map.put(1002, emp2);

		// Add the employee in map
		EmployeeMap employeeMap = new EmployeeMap();
		employeeMap.setEmpMap(map);

		JAXBContext jaxbContext = JAXBContext.newInstance(EmployeeMap.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		jaxbMarshaller.marshal(employeeMap, System.out);
		jaxbMarshaller.marshal(employeeMap,
				new File("E:/codebase/employees.xml"));

	}
}




