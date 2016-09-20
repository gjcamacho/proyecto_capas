package ui;

import java.util.Scanner;
import bi.LoginVerification;

public class Login {

	public boolean executeLogin() {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Bienvenido al Sistema de alumnos UMIN");
		System.out.println("Coloque su usuario:");
		
		String user=sc.nextLine();
		
		System.out.println("Coloque su contraseña:");
		
		String password=sc.nextLine();
		
		LoginVerification loginVerification=new LoginVerification();
		
		boolean accessGranted=loginVerification.verifyLogin(user,password);
		
		if(accessGranted){
			System.out.println("Bienvenue, a la class du Programming");
		}
		else{
			System.out.println("My deepest apologies, please kindly leave...");
		}
		
		return accessGranted;
		
	}

}
