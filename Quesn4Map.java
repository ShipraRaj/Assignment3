package package4;

import java.util.LinkedHashMap;
import java.util.Map;

public class Quesn4Map {

	public static void main(String[] args) {

		Employee e1= new Employee(10,"Shipra","Diretor");
		Employee e2= new Employee(20,"Shaanu","Manager");
		Employee e3= new Employee(30,"Riya","Worker");
		Employee e4= new Employee(40,"Alka","Employer");
		Map<Employee,Integer> map=new LinkedHashMap<>();
		map.put(e1,100);
		map.put(e2,200);
		map.put(e3,300);
		map.put(e4,400);
		for(Employee key:map.keySet()) {
			System.out.println(key + "." + map.get(key));
			
		}

	}

}
