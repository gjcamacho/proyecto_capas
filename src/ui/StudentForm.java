package ui;

import java.util.Scanner;

import bi.Student;

public class StudentForm {

	public void captureData() {
		
		Student newStudent=new Student();
		
		System.out.println("Escriba el nombre del Estudiante: ");
		newStudent.name=getFieldData();
		
		System.out.println("Escriba la matrícula: ");
		newStudent.register=getFieldData();
		
		System.out.println("Escriba la edad: ");
		newStudent.age=getFieldData();
		
		newStudent.save();
	}
	
	public String getFieldData(){
		Scanner sc=new Scanner(System.in);
		return sc.nextLine();
	}

}
