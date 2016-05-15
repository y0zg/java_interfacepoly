/**
 * Created by webstddesign on 12.05.2016.
 */
public class SalariedEmployee extends Employee {
	public double weeklySalary;

	public SalariedEmployee(String firstName, String lastName, String securityNumber, double weeklySalary) {
		super(firstName, lastName, securityNumber);

		if (weeklySalary < 0) {
			throw new IllegalArgumentException("Weekly salary must be > 0");
		}

		this.weeklySalary = weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary){
		this.weeklySalary=weeklySalary;
	}

public String toString(){
	return 	String.format("%s: %n%s, %s %n%s: %s",
			"SalariedEmployee First & Last name",
			getFirstName(),
			getLastName(),
			"SecurityNumber",
			getSecurityNumber()
	);
}

	public double getPayable(){
		return weeklySalary;
	}
}
