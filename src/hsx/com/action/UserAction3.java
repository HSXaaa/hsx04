//模型驱动(ModelDriven) 只能接收一个对象模型
package hsx.com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import hsx.com.model.User;
import hsx.com.service.UserService;

public class UserAction3 extends ActionSupport implements ModelDriven<User>{

	
	
	private static final long serialVersionUID=1L;
	
	private UserService userService=new UserService();
	
	private User user=new User();

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}


	public String execute() throws Exception {
		System.out.println("执行了UserAction3的默认方法");
		if(userService.login(user)) {
			return SUCCESS;
		}else {
			return ERROR;
		}

	}

}





