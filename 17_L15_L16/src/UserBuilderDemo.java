class User {
    private final String username; 
    private final String email;    
    private User(UserBuilder builder) {
        this.username = builder.username;
        this.email = builder.email;
    }
    @Override
	public String toString() {
		return "User [username=" + username + ", email=" + email + "]";
	}

	// Static Nested Class: Exists independently to help build the outer class
    static class UserBuilder {
        private final String username;
        private String email;
        public UserBuilder(String username) {
            this.username = username;
        }
        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }
        public User build() {
            return new User(this);
        }
    }
}
public class UserBuilderDemo{
	public static void main(String args[]) {
		User user = new User.UserBuilder("mohan").email("mohan.shenoy@manipal.edu").build();
		System.out.println("User Object :"+user);
	}
}
