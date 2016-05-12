/**
 * Created by webstddesign on 12.05.2016.
 */
public class Invoice implements Payable {

	private final String partNumber;
	private final String partDescription;
	private int quantity;
	private double pricePerItem;

	public Invoice(String partNumber,String partDescription,int quantity, double pricePerItem)
	{
		if (quantity<0){
			throw new IllegalArgumentException("Quantity should be > 0");
		}

		if (pricePerItem<0){
			throw new IllegalArgumentException("pricePerItem should be > 0");
		}

		this.partNumber=partNumber;
		this.partDescription=partDescription;
		this.quantity=quantity;
		this.pricePerItem=pricePerItem;
	}

	public String getPartNumber(){
		return partNumber;
	}

	public String getPartDescription(){
		return partDescription;
	}

	public void setQuantity(int quantity){
		if (quantity<0){
			throw new IllegalArgumentException("q should be >0");
		}

		this.quantity=quantity;
	}

	public int getQuantity(){
		return quantity;
	}

	public double getPricePerItem(){
		return pricePerItem;
	}

	@Override
	public double getPayable(){
		return getQuantity()*getPricePerItem();
	}

	@Override
	public String toString(){
		return String.format("%s: %n%s: %s %s %n%s: %d %n%s: $%,.2f","invoice","partnumber",
				getPartNumber(),
				getPartDescription(),"quantity",getQuantity(),"price per item",getPricePerItem());
	}

}


