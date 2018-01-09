package hello;

public class Person {

	private final int id;
	private final String name;
	private final String country;

	public Person(int id, String name, String country) {
		this.id = id;
		this.name = name;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this country = country;
	}

}