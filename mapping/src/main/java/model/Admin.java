package model;

public class Admin extends Employee {
private String branchName;

public Admin(int id, String name, double salary, String email, String branchName) {
	super(id, name, salary, email);
	this.branchName = branchName;
}

public String getBranchName() {
	return branchName;
}

public void setBranchName(String branchName) {
	this.branchName = branchName;
}

}
