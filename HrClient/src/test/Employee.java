package test;

import com.tangosol.net.CacheFactory;
import com.tangosol.net.NamedCache;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        NamedCache employee = CacheFactory.getCache("Employee");
        model.Employee emp =  (model.Employee) employee.get(200L);
        System.out.println("EmpNo: "+emp.getEmployeeId());
        System.out.println("Employee department: "+emp.getDepartment().getDepartmentName());

	}

	
}
