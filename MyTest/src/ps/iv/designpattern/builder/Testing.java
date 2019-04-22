package ps.iv.designpattern.builder;

import ps.iv.designpattern.builder.User.UserBuilder;

public class Testing {

	public static void main(String[] args) {
		
		User user = new UserBuilder()
						.addUserID(1l)
						.addName("Pandidurai")
						.addAge(28)
//						.addCity("Madurai")
						.build();
		
		System.out.println(user);
	}

}
