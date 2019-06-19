package kr.re.kitri.hellospring.model;

public class User {
	
	private Integer userid;
	private String username;
	private Integer age;
	
	public User() {}

	public User(Integer userid, String username, Integer age) {
		super();
		this.userid = userid;
		this.username = username;
		this.age = age;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", age=" + age + "]";
	}
	
}
