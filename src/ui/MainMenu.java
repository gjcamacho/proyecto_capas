package ui;

import java.util.Scanner;

public class MainMenu {
	
	public MainMenu(){
		
	}
	
	public void printMenu(){
		System.out.println("Menu del Programa para registrar Estudiantes y Profesores");
		System.out.println("");
		System.out.println("Opciones\n\n");
		System.out.println("1) Capturar Estudiante");
		System.out.println("2) Capturar Profesor");
		System.out.println("3) Listar Estudiantes");
		System.out.println("0) Salir\n\n");
		System.out.println("Elija su opcion:");
		
	}
	
	public String readOption(){
		Scanner sc=new Scanner(System.in);
		
		return sc.nextLine();
	}
	
	public void executeMenu(){
		String opcion="";
		while(!opcion.equals("0")){
			printMenu();
			opcion=readOption();
			
			if(opcion.equals("1")){
				StudentForm studentForm=new StudentForm();
				
				studentForm.captureData();
			}
			
			if(opcion.equals("3")){
				StudentList studentList=new StudentList();
				
				studentList.listStudents();
			}
		}
		
		System.out.println("Namarie");
	}

}
