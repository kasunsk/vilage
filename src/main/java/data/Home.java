package main.java.data;

public class Home {

	private String home_id;
	private String home_addres;
	private int members;
	 
	private void setHomeId(String home_id){
		this.home_id = home_id;
	}
	
	private String getHomeId(){
		return this.home_id;
	}
	
	private void setHomeAddres(String home_addres){
		this.home_addres = home_addres;
	}
	
	private String getHomeAddres(){
		return this.home_addres;
	}
	
	private void setMembers(int members){
		this.members = members;
	}
	
	private int getMembers(){
		return this.members;
	}
}
