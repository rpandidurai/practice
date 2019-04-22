/**
 * 
 */
package ps.iv.designpattern.builder;

/**
 * @author e3025685
 *
 */
public class User {
	
	private final long userID;
	private final String name;
	private final int age;
	private final String city;
	
	private User(UserBuilder builder) {
		super();
		this.userID = builder.userID;
		this.name = builder.name;
		this.age = builder.age;
		this.city = builder.city;
	}
	
	public long getUserID() {
		return userID;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	public String getCity() {
		return city;
	}

	public static class UserBuilder
	{
		private long userID;
		private String name;
		private int age;
		private String city;
		
		public UserBuilder addUserID(long userID)
		{
			this.userID = userID;			
			return this;
		}
		
		public UserBuilder addName(String name)
		{
			this.name = name;			
			return this;
		}
		
		public UserBuilder addAge(int age)
		{
			this.age = age;			
			return this;
		}
		
		public UserBuilder addCity(String city)
		{
			this.city = city;			
			return this;
		}
		
		public User build()
		{
			User user = new User(this);
			
			return user;
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.userID + " , " + this.name + " , " + this.age + " , "+this.city;
	}
}
