package controler;

import java.sql.SQLException;
import java.util.Scanner;

import data.Persion;
import data.DBConnection;

import org.eclipse.swt.widgets.Display;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import user_interface.Welcome;
//import data.Config;

public class Control {

	private static final Logger log = LoggerFactory.getLogger(Control.class);
	
	public static void main(String[] args) throws SQLException {	
		
		String[] arguments = new String[] {"123"};
		Welcome.main(arguments);
		//Welcome welcome = new Welcome();
		//welcome.run();
//		welcome.setBlockOnOpen(true);
//		welcome.open();
//		Display.getCurrent().dispose();
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		log.info("Entered to worked...");
		
		System.out.println("Select");
		System.out.println("1 if you want to add a persion to database");
		System.out.println("2 if you want to serch a persion from the data base");
		int a = input.nextInt();
		
	while(!(a == 1 || a == 2))	{
		System.out.println("Chose a number 1 or 2 :");
		a = input.nextInt();
	}
	
	if (a == 1){
		
		Persion persion = new Persion();
		
		System.out.println("Now you are going to add a persion to the data base");
		System.out.println();
		
		System.out.print("Name : ");
		input.nextLine();
		String name = input.nextLine();
		persion.setName(name);
		
		System.out.print("ID Number : ");
		String id = input.next();
		persion.setId(id);
		
		System.out.print("Sex (m or f) :  ");
		String sex = input.next();
		while(!(sex.equals("m") || sex.equals("f") )){
			System.out.print("Sex (m or f) :  ");
			sex = input.nextLine();
			
		}
		if (sex.equals("m"))
			persion.setSex("Male");
		else 
			persion.setSex("Female");
		
		System.out.print("Address : ");
		input.nextLine();
		String addres = input.nextLine();
		persion.setAddres(addres);
		
		System.out.print("TP Number : ");
		String tp = input.next();
		persion.setTpNumber(tp);
		System.out.println();
		
		DBConnection db = new DBConnection();
		db.addPersion(persion.getId(), persion.getName(),persion.getSex(), persion.getAddress(),persion.getTpNum());
		
		log.info("Persion data succesfully added !");
		
		System.out.println();
		System.out.println("Name : "+persion.getName());
		System.out.println("ID : "+persion.getId());
		System.out.println("Sex : "+persion.getSex());
		System.out.println("Address : "+persion.getAddress());
		System.out.println("TP Number : "+persion.getTpNum());
		
	}
	}
}
