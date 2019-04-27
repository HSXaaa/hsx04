//ģ������(ModelDriven) ֻ�ܽ���һ������ģ��
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
		System.out.println("ִ����UserAction3��Ĭ�Ϸ���");
		if(userService.login(user)) {
			return SUCCESS;
		}else {
			return ERROR;
		}

	}

}





