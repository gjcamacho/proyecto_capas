package bi;

import java.util.StringTokenizer;

import da.StudentDataAccess;

public class Student {

	public String name;
	public String register;
	public String age;
	
	public Student(String data) {
		
		StringTokenizer st=new StringTokenizer(data,",");
		
		String primerPar=st.nextToken();
		String segundoPar=st.nextToken();
		String tercerPar=st.nextToken();
		
		StringTokenizer namePair=new StringTokenizer(primerPar,"=");
		namePair.nextToken();
		this.name=namePair.nextToken();
		
		namePair=new StringTokenizer(segundoPar,"=");
		namePair.nextToken();
		this.register=namePair.nextToken();
		
		namePair=new StringTokenizer(tercerPar,"=");
		namePair.nextToken();
		this.age=namePair.nextToken();
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public void save() {
		StudentDataAccess studentDA=new StudentDataAccess();
		
		studentDA.save(this);
		
		
	}

	@Override
	public String toString() {
		return "name=" + name + ", register=" + register + ", age=" + age;
	}

}
