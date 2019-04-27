//JavaBean类型属性；可以接收多个对象模型
package hsx.com.action;

import com.opensymphony.xwork2.ActionSupport;

import hsx.com.model.User;
import hsx.com.service.UserService;

public class UserAction2 extends ActionSupport{

	private static final long serialVersionUID=1L;
	
	private UserService userService=new UserService();
	
	private User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	public String execute() throws Exception {
		System.out.println("执行了UserAction2的默认方法");
		if(userService.login(user)) {
			return SUCCESS;
		}else {
			return ERROR;
		}

	}

}


