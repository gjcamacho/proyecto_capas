package ui;

import java.util.LinkedList;

import bi.Student;
import da.StudentDataAccess;

public class StudentList {

	public void listStudents() {
		StudentDataAccess studentDA=new StudentDataAccess();
		LinkedList<Student> studentList=studentDA.getAllStudents();
		
		System.out.println("Matricula\t\t\tNombre\t\t\tEdad");
		
		for(int i=0; i<studentList.size();i++){
			Student student=studentList.get(i);
			
			System.out.println(student.register + "\t\t\t\t" + student.name + "\t\t\t" + student.age);
		}
		
	}

}
