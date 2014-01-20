package main.java.data;

public class Home {

	private String home_id;
	private String home_addres;
	private int members;
	 
	public void setHomeId(String home_id){
		this.home_id = home_id;
	}
	
	public String getHomeId(){
		return this.home_id;
	}
	
	public void setHomeAddres(String home_addres){
		this.home_addres = home_addres;
	}
	
	public String getHomeAddres(){
		return this.home_addres;
	}
	
	public void setMembers(int members){
		this.members = members;
	}
	
	public int getMembers(){
		return this.members;
	}
}
