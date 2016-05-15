/**
 * Created by webstddesign on 12.05.2016.
 */
public abstract class Employee implements Payable{
	public String firstName;
	public String lastName;
	public String securityNumber;

	public Employee(String firstName, String lastName, String securityNumber) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.securityNumber = securityNumber;

	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getSecurityNumber() {
		return securityNumber;
	}


}
