package data;

public class Config {
	private String username = "kasun";
	private String password = "password";
	
	public boolean chekAuthenticate(String username, String password){
		if(username.equals(this.username) && password.equals(this.password))
			return true;
		else 
			return false;
	}
}
