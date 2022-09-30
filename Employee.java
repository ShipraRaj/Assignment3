package package4;

public class Employee {
	int age;
	String name;
	String designation;

			Employee(int age,String name,String designation){
				this.age=age;
				this.name=name;
				this.designation=designation;
				
	}
			public String toString() {
				return "(age is -> " + age + "," + "name is -> " + name + "," + "designation is -> " + designation+")"; 
			}

}
