//属性驱动(FieldDriven)
package hsx.com.action;

import com.opensymphony.xwork2.ActionSupport;

import hsx.com.model.User;
import hsx.com.service.UserService;

public class UserAction extends ActionSupport{

	private static final long serialVersionUID=1L;
	
	private UserService userService=new UserService();
	
	private String userName;
	private String password;
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String execute() throws Exception {
		System.out.println("执行了UserAction的默认方法");
		User user=new User();
		user.setUserName(userName);
		user.setPassword(password);
		if(userService.login(user)) {
			return SUCCESS;
		}else {
			return ERROR;
		}

	}
}
