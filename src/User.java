
public class User {
	
	private String username,address;
	private int age;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public User(String username, String address, int age) {
		super();
		this.username = username;
		this.address = address;
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", address=" + address + ", age="
				+ age + "]";
	}
}
