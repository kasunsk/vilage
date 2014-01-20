package main.java.controler;

import java.sql.SQLException;
import java.util.Scanner;

import main.java.data.*;
import main.java.windows.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Control {
	
	
	public Config config = new Config();

	private static final Logger log = LoggerFactory.getLogger(Control.class);
	
	public static void main(String[] args) throws SQLException {	

		Welcome window1 = new Welcome();
		window1.open();
				
		log.info("Entered to worked...");
		
		//DBConnection db = new DBConnection();
		//db.addPersion(persion.getId(), persion.getName(),persion.getSex(), persion.getAddress(),persion.getTpNum());
		
		log.info("Persion data succesfully added !");
		
		System.out.println();
//		System.out.println("Name : "+persion.getName());
//		System.out.println("ID : "+persion.getId());
//		System.out.println("Sex : "+persion.getSex());
//		System.out.println("Address : "+persion.getAddress());
//		System.out.println("TP Number : "+persion.getTpNum());
		
	
}
	public boolean canEnter(String username,String password){
		
		System.out.println("User Name "+username);
		System.out.println("Password "+password);
		
		Config config = new Config();
		if(config.chekAuthenticate(username, password)){
			System.out.println("returned true");
			return true;
		}
		System.out.println("returned false");
		return false;
	}
}
