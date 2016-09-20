package bi;

import da.LoginDataAccess;

public class LoginVerification {

	public boolean verifyLogin(String user, String password) {
		// TODO Auto-generated method stub
		
		LoginDataAccess loginDataAccess=new LoginDataAccess();
		
		LoginInfo loginInfo=loginDataAccess.getLoginInfo();
		
		if(loginInfo.user.equals(user) && loginInfo.password.equals(password)){
			return true;
		}
		
		return false;
	}

}
