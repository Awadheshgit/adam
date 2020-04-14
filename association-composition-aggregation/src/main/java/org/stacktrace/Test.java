package org.stacktrace;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {

		Student student1 = new Student("Awadhesh", 1001, "IT");
		Student student2 = new Student("Nitesh", 1002, "IT");
		Student student3 = new Student("Meti", 1003, "IT");

		Student student4 = new Student("Anmol", 1001, "CS");
		Student student5 = new Student("Ashim", 1002, "CS");

		// Making a List Of IT Students
		List<Student> it_Students = new ArrayList<Student>();
		it_Students.add(student1);
		it_Students.add(student2);
		it_Students.add(student3);

		// Making a List Of CS Students
		List<Student> cs_students = new ArrayList<Student>();
		cs_students.add(student4);
		cs_students.add(student5);

		Department it = new Department("IT", it_Students);
		Department cs = new Department("CS", cs_students);

		List<Department> departments = new ArrayList<Department>();
		departments.add(it);
		departments.add(it);

		// Creating instance of Institute
		Institute institute = new Institute("B.tech", departments);

		System.out.print("Total Stusdents In Institude : ");
		System.out.print(institute.getTotalStudentsInstitute());
	}
}
