package hsx.com.action;

import com.opensymphony.xwork2.ActionSupport;

public class BackStudent extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		System.out.println("ִ����BackStudent Action��Ĭ�Ϸ���");
		return SUCCESS;
	}
	
	public String show()throws Exception{
		System.out.println("ִ���� BackStudent show����");
		return SUCCESS;
	}

}
