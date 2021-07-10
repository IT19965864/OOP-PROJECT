package Entity;

public class SoldReservedProperty {
	private int propertyid;
	private String buyernic;
	private String type;
	
	public SoldReservedProperty(int propertyid, String buyernic, String type) {
		super();
		this.propertyid = propertyid;
		this.buyernic = buyernic;
		this.type = type;
	}
	
	public int getPropertyid() {
		return propertyid;
	}

	public String getBuyernic() {
		return buyernic;
	}

	public String getType() {
		return type;
	}
}
