package com.comapny.codewal23;

public class QueryGenerator {
	public StringBuilder queryGenerator(int salary, String empid) {
		StringBuilder query = new StringBuilder("Select * from Employee ");
		if (salary > 0) {
			query.append("where salary = " + salary + ";");
		} else if (empid != null) {
			query.append("where wmoId = " + empid + ";");
		} else {
			query.append(";");
		}
		return query;
	}

}
