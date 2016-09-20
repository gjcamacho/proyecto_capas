package da;

import bi.LoginInfo;
import java.io.*;

public class LoginDataAccess {

	public LoginInfo getLoginInfo() {
		
		try {
			FileInputStream fis=new FileInputStream("acceso.dat");
			
			BufferedReader buf = new BufferedReader(new InputStreamReader(fis));
			
			String username=buf.readLine();
			String password=buf.readLine();
			
			return new LoginInfo(username, password);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("FileNotFound");
			return null;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("IOException");
			return null;
		}
		
		
		
	}

}
