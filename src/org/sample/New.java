package org.sample;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class New extends SampleMap {
	public static void main(String[] args) {
		
		New n1=new New();
		n1.setEmpId(101);
		n1.setName("Ram");
		n1.setPhoneNo(8754544243l);
		n1.setAddress("No:74, East Tambaram,Chennai:600059");
		n1.setDob("09-09-1986");
		n1.setDoj("01-02-2021");
		n1.setEmail("ram@gmail.com");
		n1.setGender('M');
		n1.setSal(20000.45f);
		New n2=new New();
		n2.setEmpId(102);
		n2.setName("Venkat");
		n2.setPhoneNo(8754645498l);
		n2.setAddress("No:64, Mudichur,Chennai:600049");
		n2.setDob("12-02-1980");
		n2.setDoj("05-02-2021");
		n2.setEmail("venkat@gmail.com");
		n2.setGender('M');
		n2.setSal(15000.350f);
		New n3=new New();
		n3.setEmpId(103);
		n3.setName("Swetha");
		n3.setPhoneNo(9865432456l);
		n3.setAddress("No:29, Adayar,Chennai:600009");
		n3.setDob("10-02-1990");
		n3.setDoj("15-02-2021");
		n3.setEmail("swetha@gmail.com");
		n3.setGender('F');
		n3.setSal(35000.432f);
		New n4=new New();
		n4.setEmpId(104);
		n4.setName("Raji");
		n4.setPhoneNo(9884246010l);
		n4.setAddress("No:232, Mylapore,Chennai:600009");
		n4.setDob("29-02-1990");
		n4.setDoj("30-01-2021");
		n4.setEmail("raji@gmail.com");
		n4.setGender('F');
		n4.setSal(4000.432f);
		New n5=new New();
		n5.setEmpId(105);
		n5.setName("Suren");
		n5.setPhoneNo(9884246010l);
		n5.setAddress("No:11, Chrompet,Chennai:600011");
		n5.setDob("08-08-1987");
		n5.setDoj("30-01-2021");
		n5.setEmail("suren@gmail.com");
		n5.setGender('M');
		n5.setSal(35000.645f);
		Map<Integer,SampleMap>emp=new LinkedHashMap<Integer,SampleMap>();
		emp.put(1, n1);
		emp.put(2, n2);
		emp.put(3, n3);
		emp.put(4, n4);
		emp.put(5, n5);
		
       Set<Entry<Integer, SampleMap>> entrySet = emp.entrySet();
       for (Entry<Integer, SampleMap> entry : entrySet) {
    	   System.out.println(entry.getValue().getEmpId());
    	   System.out.println(entry.getValue().getName());
    	   System.out.println(entry.getValue().getPhoneNo());
    	   System.out.println(entry.getValue().getDob());
    	   System.out.println(entry.getValue().getDoj());
    	   System.out.println(entry.getValue().getAddress());
    	   System.out.println(entry.getValue().getEmail());
    	   System.out.println(entry.getValue().getGender());
    	   System.out.println(entry.getValue().getSal());
		
	}
	}

}
