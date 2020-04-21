package org.stacktrace;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "employees")
@XmlAccessorType(XmlAccessType.FIELD)
public class EmployeeMap {

	private Map<Integer, Employee> empMap = new HashMap<Integer, Employee>();

	public Map<Integer, Employee> getEmpMap() {
		return empMap;
	}

	public void setEmpMap(Map<Integer, Employee> empMap) {
		this.empMap = empMap;
	}

}
