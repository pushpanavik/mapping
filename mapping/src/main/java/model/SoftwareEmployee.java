package model;

public class SoftwareEmployee extends Employee {
	private String technology;

	public SoftwareEmployee(int id, String name, double salary, String email, String technology) {
		super(id, name, salary, email);
		this.technology = technology;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	
	

}
