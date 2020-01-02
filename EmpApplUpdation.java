package com.deloitte.empl.applications;

import com.deloitte.empl.dao.EmpDao;
import com.deloitte.empl.dao.impl.EmpDaoImpl;

public class EmpApplUpdation {
	public static void main(String[] args) {
	int rows=0;
		EmpDao dao = new EmpDaoImpl();
		rows=dao.updateEmp(123,7788);
		if(rows>0)
			System.out.println("updated");
		else
			System.out.println("not updated");
		
		
	}
}
