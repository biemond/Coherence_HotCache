package test;

import com.tangosol.net.CacheFactory;
import com.tangosol.net.NamedCache;

public class Department {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        NamedCache department = CacheFactory.getCache("Department");
        model.Department dept =  (model.Department) department.get(10L);
        System.out.println("Department: "+dept.getDepartmentName());
	}

}
