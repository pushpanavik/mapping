package bean;

public class CollegeDepartment {

	private int id;
	private String name;
	private int salary;
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public CollegeDepartment(int id, String name, int salary, String email) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.email = email;
	}
	public CollegeDepartment() {
		
	}
	@Override
	public String toString() {
		return "CollegeDepartment [id=" + id + ", name=" + name + ", salary=" + salary + ", email=" + email + "]";
	}
	

}
