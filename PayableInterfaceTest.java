/**
 * Created by webstddesign on 12.05.2016.
 */
public class PayableInterfaceTest {
	public static void main(String args[]) {
		Invoice in = new Invoice("AAA", "BBB", 5, 5.0);
		System.out.println(in.toString());

//if interface is Payable, array must be Payable as well
//you cannot explicitly create object of interface type
/* new array of payables with 4 elements creates an array of 4 references to payable objects
* but it doesn't create payable object itself
*
* */
		Payable[] payableObjects = new Payable[4]; //4 element arrays with 4 null values
		//because no objects are assigned to objects references

		//we assign to each element of array a new object
		payableObjects[0] =
				new Invoice("InvoiceAAA1", "BBB1", 11, 11.0); //new instance of Invoice class
		//because invoice is payable object, Invoice implements Payable
		payableObjects[1] =
				new Invoice("InvoiceAAA2", "BBB2", 22, 22.0);

		//if we remove Employee implements Payable
		//error java incompatible types: SalariedEmployee cannot be converted to Payable
		payableObjects[2] =
				new SalariedEmployee("SE John", "Luis","Number:111", 33.0);
		payableObjects[3] =
				new SalariedEmployee("SE Robert", "Levandovski","Number:111", 44.0);

		//for each of the payables in Payable objects array we will call it currentPayable
				for (Payable currentPayable : payableObjects) {
					//call toString method explicitly but could run implicitly
			System.out.printf("%n%s %ngetPayable:$%,.2f %n",
					currentPayable.toString(),
					currentPayable.getPayable());
/*at compile time the copiler knows that the variable current payable is a payable object
* but compiler doesn't know which kind of payable object it is
*
* at runtime, it's the type of the actual object that determines
*  which toString method gets called
* */
		}

	}
}
