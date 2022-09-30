package package3;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class SortEmployee {
	private int age;
	private String name;
	private double Salary;

		 SortEmployee(String name,int age,double Salary){
				this.age=age;
				this.name=name;
				this.Salary=Salary;
			}
		 public String getName() {
			 return name;
		 }
		 public void setName(String name) {
			 this.name=name;
		 }
		 public int getAge() {
			 return age;
		 }
		 public void setAge(int age) {
			 this.age=age;
		 }
		 public double getSalary() {
			 return Salary;
		 }
		 public void setSalary(double Salary) {
			 this.Salary=Salary;
		 }
				
				
	public static void main(String[] args) {
	SortEmployee emp1= new SortEmployee("Shipra",23,5000);
	SortEmployee emp2= new SortEmployee("Rashi",22,8000);
	SortEmployee emp3= new SortEmployee("Alka",21,7000);
	List <SortEmployee> emplist = new ArrayList<>();
	emplist.add(emp1);
	emplist.add(emp2);
	emplist.add(emp3);
		Collections.sort(emplist,new Comparator<SortEmployee>() {
			public int compare(SortEmployee e1, SortEmployee e2) {
				if(emp1.getSalary()>emp2.getSalary()) {
					return 1;
				}
				else if(emp1.getSalary()== emp2.getSalary()) {
					return 0;
				}
				else {
					return -1;
				}
			}

		});
		
System.out.println("Employees in decreasing order of salary");
Collections.reverse(emplist);
for(SortEmployee e : emplist) {
	System.out.println(e.getName() + " " + e.getSalary());
}
}
}