package com.deloitte.empl.applications;
import com.deloitte.empl.dao.EmpDao;
import com.deloitte.empl.dao.impl.EmpDaoImpl;
public class EmpApplnDeletion {
	public static void main(String[] args) {
		EmpDao dao = new EmpDaoImpl();
		int rows=dao.deletion(11);
		if(rows>0)
			System.out.println("deleted");
		else
			System.out.println("not deleted");		
	}
}
