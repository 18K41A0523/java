package inheritdemo;

public class Manager extends Employees{
	
	private String address;
	
	public Manager(int empID,String empName,String address) {
		super(empID,empName);
		this.address=address;
	}

	@Override
	public String toString() {
		return "Manager [address=" + address + "]";
	}

}
