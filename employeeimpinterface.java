package employeemanagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class employeeimpinterface implements employeeinterface {
	Connection con;

	public void createEmployee(Employee e) {
	   con=dbconnection.createdbconnection();
	   String query="insert into employee values(?,?,?,?)";
	  try {
		  PreparedStatement psmt=con.prepareStatement(query);
		  psmt.setInt(1, e.getId());
		  psmt.setString(2, e.getName());
		  psmt.setDouble(3, e.getSalary());
		  psmt.setInt(4, e.getAge());
		  int count=psmt.executeUpdate();
		  if(count!=0) {
			  System.out.println("Employee is added");
		  }
		  
	  }catch(Exception ex) {
		  ex.printStackTrace();
	  }
		
	}

	public void showAllEmployee() {
	 con=dbconnection.createdbconnection();
	 String query="select * from employee";
	 System.out.println("Emoloyee details");
	 try {
		 Statement stmt=con.createStatement();
		 ResultSet result=stmt.executeQuery(query);
		 while(result.next()) {
			 System.out.println(result.getInt(1) +  result.getString(2)+ result.getDouble(3)+ result.getInt(4));
		 }
		 
		 
		 
	 }catch(Exception ex) {
		 ex.printStackTrace();
	 }
		
	}

	public void showEmployeeBasedOnID(int id) {
		con=dbconnection.createdbconnection();
		String query="select * from employee where id="+id;
		try {
			Statement stmt=con.createStatement();
			ResultSet result=stmt.executeQuery(query);
			while(result.next()) {
				System.out.println(result.getInt(1) +  result.getString(2)+ result.getDouble(3)+ result.getInt(4));
			}
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}

	public void updateEmployee(int id, String name) {
		con=dbconnection.createdbconnection();
		String query="update employee set name=? where id=? ";
		try {
			 PreparedStatement psmt=con.prepareStatement(query);
			 psmt.setString(1,name);
			 psmt.setInt(2, id);
			 int cnt=psmt.executeUpdate();
			 if(cnt!=0) {
				 System.out.println("employee details updated successfully");
			 }
			 
			 
			 
			 
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	    
		
	}

	public void deleteEmployee(int id) {
		con=dbconnection.createdbconnection();
		String query="delete from employee where id=? ";
		try {
			 PreparedStatement psmt=con.prepareStatement(query);
			 psmt.setInt(1, id);
			 int cnt=psmt.executeUpdate();
			 if(cnt!=0) {
				 System.out.println("employee deleted successfully!!!"+id);
			 }
			 
			 
			 
			 
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		
	}
	
	

}
