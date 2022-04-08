package inheritdemo;

public class Admin extends Employees{
	  
       private String domain;
	   public Admin(int empID, String empName,String domain) {
		super(empID, empName);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Admin [domain=" + domain + "]";
	}

	
	   
}
