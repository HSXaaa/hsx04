package hsx.com.action;

import com.opensymphony.xwork2.ActionSupport;

public class ForeStudent extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		System.out.println("ִ����ForeStudent Action��Ĭ�Ϸ���");
		return SUCCESS;
	}

}
