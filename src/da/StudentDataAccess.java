package da;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

import bi.Student;

public class StudentDataAccess {

	public void save(Student student) {
		
		try {
			File file=new File("estudiantes.dat");
			FileWriter fw;
			
			if(!file.exists()){
				file.createNewFile();
				fw=new FileWriter(file);
			}
			else{
				fw=new FileWriter(file, true);
			}
			
			fw.write(student.toString() + "\n");
			fw.flush();
			fw.close();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public LinkedList<Student> getAllStudents() {
		
		FileInputStream fis;
		try {
			fis = new FileInputStream("estudiantes.dat");
		
			BufferedReader buf = new BufferedReader(new InputStreamReader(fis));
			
			LinkedList<Student> studentList=new LinkedList<Student>();
			
			while(buf.ready()){
				String studentFromFile=buf.readLine();
				
				
				Student student=new Student(studentFromFile);
				
				
				
				studentList.add(student);
			}
			
			return studentList;
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
