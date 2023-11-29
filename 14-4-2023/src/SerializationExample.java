import java.io.Serializable;

public class SerializationExample implements Serializable {
	
	private Integer id;
	private String firstname;
	private String lastname;
	private String location;
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public SerializationExample() {
		super();
	}

	public SerializationExample(Integer id, String firstname, String lastname, String location) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.location = location;
	}

	@Override
	public String toString() {
		return "SerializationExample [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", location="
				+ location + "]";
	}

	
	
	

}
