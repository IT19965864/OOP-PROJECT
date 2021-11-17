package Entity;

import com.mysql.jdbc.StringUtils;

public class Property {
	
	private int propertyID;
	private String ownerID;
	private String location;
	private int area;
	private int value;
	private String category;
	private String type;
	
	public Property(int propertyID,String ownerID, String location, int area, int value, String category,String type) {
		super();
		this.propertyID = propertyID;
		this.ownerID = ownerID;
		this.location = location;
		this.area = area;
		this.value = value;
		this.category =  category;
		this.type  = type;
	}
	public int getPropertyID() {
		return propertyID;
	}
	public String getOwnerID() {
		return ownerID;
	}
	
	public String getLocation() {
		return location;
	}

	public int getArea() {
		return area;
	}
	
	public int getValue() {
		return value;
	}
	public String getCategory() {
		return category;
	}
	public String getType() {
		return type;
	}
	
}
