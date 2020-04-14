package org.stacktrace;

import java.util.List;

public class Institute {
	String instituteName;

	private List<Department> departments;

	public Institute(String instituteName, List<Department> departments) {
		super();
		this.instituteName = instituteName;
		this.departments = departments;
	}

	// count total students of all departments
	// in a given institute
	public int getTotalStudentsInstitute() {
		int noOfStudents = 0;
		List<Student> students;

		for (Department dept : departments) {
			students = dept.getStudents();
			for (Student student : students) {
				noOfStudents++;
			}
		}
		return noOfStudents;
	}
}
