package Lab9;

import java.util.Scanner;

public class Exercise4 {
	private String name;
     public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		Exercise4 obj=new Exercise4();
		
		System.out.println("Enter employee name:");
		obj.setName(sc.nextLine());
		
		Employee emp=obj::getName;
		System.out.println("Emp name: "+emp.getName());
		

	}

}
@FunctionalInterface
interface Employee {
	String getName();
}
