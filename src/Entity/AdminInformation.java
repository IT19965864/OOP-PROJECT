package Entity;

public class AdminInformation {
	
	private int id;
	private String firstname;
	private String lastname;
	private String nic;
	
	public AdminInformation(int id, String firstname, String lastname, String nic) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.nic = nic;
	}
	public int getId() {
		return id;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}
	
	public String getNic() {
		return nic;
	}
}
