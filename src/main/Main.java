package main;

import ui.Login;
import ui.MainMenu;

public class Main {

	public static void main(String[] args){
		System.out.println("Arrancando sistema...");
		
		Login login=new Login();
		
		boolean accessGranted=login.executeLogin();
		
		if(accessGranted){
			MainMenu mainMenu=new MainMenu();
			mainMenu.executeMenu();
		}
		else{
			System.out.println("goodBye");
		}
	}
	
}
