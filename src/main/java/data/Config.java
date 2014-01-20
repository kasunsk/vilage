package main.java.data;

public class Config {
	private String username = "kasun";
	private String password = "pass";
	
	public boolean chekAuthenticate(String username, String password){
		if(username.equals(this.username) && password.equals(this.password))
			return true;
		else 
			return false;
	}
}
