package hsx.com.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction4 extends ActionSupport{

	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("执行了HelloAction4的默认方法");
		return SUCCESS;
	}
	

}
