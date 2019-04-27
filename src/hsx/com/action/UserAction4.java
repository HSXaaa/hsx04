//JavaBean类型属性；可以接收多个对象模型
package hsx.com.action;

import java.util.Map;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


import hsx.com.model.User;
import hsx.com.service.UserService;

public class UserAction4 extends ActionSupport{

	private static final long serialVersionUID=1L;
	
	private UserService userService=new UserService();
	
	private User user;
	
	private String error;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}


	public String execute() throws Exception {
		if(userService.login(user)){
			ActionContext actionContext=ActionContext.getContext();
			Map<String, Object> session=actionContext.getSession();
			session.put("currentUser", user);
			return SUCCESS;
		}else{
			this.error="用户名或密码错误";
			return "error";
		}
	}

}


