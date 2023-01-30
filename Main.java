package employeemanagement;
import java.util.*;

public class Main {
	public static void main(String[] args)
	{
		String name;
		int id;
		employeeinterface emp=new employeeimpinterface();
		System.out.println("Welcome to Employee Management Application");
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("1.Add Employee\n"+
		                        "2.Show All Employee\n"+
					             "3. Show employee based on id\n"+
		                          "4.Update the employee\n"+
					                "5.Delete the emoloyee");
			System.out.println("Enter Choice: ");
			
			int ch=sc.nextInt();
			switch(ch){
				case 1:
					Employee e=new Employee();
					System.out.println("Enter id:");
					 id=sc.nextInt();
					System.out.println("Enter name: ");
					 name=sc.next();
					System.out.println("Enter salary:");
					double salary=sc.nextDouble();
					System.out.println("Enter age: ");
					int age=sc.nextInt();
					e.setId(id);
					e.setName(name);
					e.setSalary(salary);
					e.setAge(age);
					emp.createEmployee(e);
					break;
				case 2:
					emp.showAllEmployee();
					break;
				case 3:
					System.out.println("enter id to show the details");
					int empid=sc.nextInt();
					emp.showEmployeeBasedOnID(empid);
					break;
				case 4:
					System.out.println("enter id to update the details");
					int  empid1=sc.nextInt();
					System.out.println("enter the new name");
					name=sc.next();
					emp.updateEmployee(empid1,name);
					break;
				case 5:
					System.out.println("enter id to delete the employee");
					id=sc.nextInt();
					emp.deleteEmployee(id);
					break;
				case 6:
					System.out.println("Thanku for using the application");
					System.exit(0);
				default:
					System.out.print("enter valid choice!");
					break;
			}
		}
		while(true);
		
		
		
	

}
}
