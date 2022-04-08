package jdbcDemo.copy2;

public class Employee {
	
	String name;
	String email;
	String city;
	int income;
	
	
	public Employee(String name, String email, String city, int income) {
		super();
		this.name = name;
		this.email = email;
		this.city = city;
		this.income = income;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + ", city=" + city + ", income=" + income + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}

}
