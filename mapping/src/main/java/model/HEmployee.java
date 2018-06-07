package model;

public class HEmployee extends Employee {
private int wh;

public HEmployee(int id, String name, double salary, String email, int wh) {
	super(id, name, salary, email);
	this.wh = wh;
}

public int getWh() {
	return wh;
}

public void setWh(int wh) {
	this.wh = wh;
}

}
