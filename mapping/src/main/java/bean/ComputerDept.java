package bean;

public class ComputerDept  extends CollegeDepartment{
private String  tools;

public String getTools() {
	return tools;
}

public void setTools(String tools) {
	this.tools = tools;
}

public ComputerDept(int id, String name, int salary, String email, String tools) {
	super(id, name, salary, email);
	this.tools = tools;
}


@Override
public String toString() {
	return "ComputerDept [tools=" + tools + "]";
}


	
}
