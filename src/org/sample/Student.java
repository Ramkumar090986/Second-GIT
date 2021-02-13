package org.sample;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Student extends NewStudent {
	public static void main(String[] args) {
		Map<Integer,NewStudent>stud=new LinkedHashMap<Integer,NewStudent>();
		Student s1=new Student();
		s1.setStdId(101);
		s1.setStdName("Ramkumar");
		s1.setDOB("09-Sep-1986");
		s1.setGender('M');
		s1.setAddress("No:74, Agasthiar street,EastTambaram,Chennai:600059");
		s1.setEmail("ram@gmail.com");
		s1.setStdPhone(8754544243l);
		Student s2=new Student();
		s2.setStdId(102);
		s2.setStdName("Raman");
		s2.setDOB("30-Apr-2000");
		s2.setGender('M');
		s2.setAddress("No:62, Kambar street,Chrompet,Chennai:600048");
		s2.setEmail("raman@gmail.com");
		s2.setStdPhone(9876543210l);
		Student s3=new Student();
		s3.setStdId(103);
		s3.setStdName("Ravi");
		s3.setDOB("03-May-1997");
		s3.setGender('M');
		s3.setAddress("No:86, Porur street,Selaiyur,Chennai:600059");
		s3.setEmail("ravi@gmail.com");
		s3.setStdPhone(9884642145l);
		Student s4=new Student();
		s4.setStdId(104);
		s4.setStdName("Reshma");
		s4.setDOB("03-May-1997");
		s4.setGender('F');
		s4.setAddress("No:23, Kalamegham street,Camproad,Chennai:600059");
		s4.setEmail("reshma@gmail.com");
		s4.setStdPhone(7845216233l);
		stud.put(1, s1);
		stud.put(2, s2);
		stud.put(3, s3);
		stud.put(4, s4);
		Set<Entry<Integer, NewStudent>> entrySet = stud.entrySet();
		for (Entry<Integer, NewStudent> entry : entrySet) {
			System.out.println(entry.getValue().getStdId());
			System.out.println(entry.getValue().getStdName());
			System.out.println(entry.getValue().getDOB());
			System.out.println(entry.getValue().getAddress());
			System.out.println(entry.getValue().getEmail());
			System.out.println(entry.getValue().getAddress());
			System.out.println(entry.getValue().getGender());
			System.out.println(entry.getValue().getStdPhone());
			
		}
	}

}
