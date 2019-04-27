package hsx.com.action;

import com.opensymphony.xwork2.ActionSupport;

public class BackStudent extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		System.out.println("执行了BackStudent Action的默认方法");
		return SUCCESS;
	}
	
	public String show()throws Exception{
		System.out.println("执行了 BackStudent show方法");
		return SUCCESS;
	}

}
