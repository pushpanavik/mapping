package bean;

public class ElectronicsDept extends CollegeDepartment {
private int workinghr;

public int getWorkinghr() {
	return workinghr;
}

public void setWorkinghr(int workinghr) {
	this.workinghr = workinghr;
}

public ElectronicsDept(int id, String name, int salary, String email, int workinghr) {
	super(id, name, salary, email);
	this.workinghr = workinghr;
}



@Override
public String toString() {
	return "ElectronicsDept [workinghr=" + workinghr + "]";
}


}
