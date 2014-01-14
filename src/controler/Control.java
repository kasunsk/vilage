package controler;

import java.util.Scanner;

import data.Persion;

public class Control {

	public static void main(String[] args) {
		String username = "ka";
		String password = "fu";
		System.out.println("Enter the User Name and Password ");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		while(!(username.equals("kasun") && password.equals("fuck"))){
			System.out.print("Username : ");
			username = input.nextLine();
			
			System.out.print("Password : ");
			password = input.nextLine();
			
			if(!(username.equals("kasun") && password.equals("fuck"))){
				System.out.print("Your username or password is wrong.. Try again...");
			}
			System.out.println("");
		}
		
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
		
		System.out.println("Now you are going to add a persion to the data base...");
		
		System.out.print("Name : ");
		String name = input.nextLine();
		persion.setName(name);
		System.out.println("....");
		
		System.out.print("ID Number : ");
		String id = input.nextLine();
		persion.setId(id);
		System.out.println();
		
		System.out.print("Sex (m or f) :  ");
		String sex = input.nextLine();
		System.out.println();
		while(!(sex.equals("m") || sex.equals("f") )){
			System.out.print("Sex (m or f) :  ");
			sex = input.nextLine();
		}
		if (sex.equals("m"))
			persion.setSex("Male");
		else 
			persion.setSex("Female");
		
		System.out.println();
		
		System.out.print("Address : ");
		String add = input.nextLine();
		persion.setAddres(add);
		System.out.println();
		
		System.out.print("TP Number : ");
		String tp = input.nextLine();
		persion.setTpNumber(tp);
		System.out.println();
		
		System.out.println("Persion data succesfully added !");
		System.out.println("Name : "+persion.getName());
		System.out.println("ID : "+persion.getId());
		System.out.println("Sex : "+persion.getSex());
		System.out.println("Address : "+persion.getAddress());
		System.out.println("TP Number : "+persion.getTpNum());
		
		
	}
	}
}
