package hsx.com.action;

import com.opensymphony.xwork2.ActionSupport;

public class CheLiangAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		System.out.println("ִ����CheLiangAction Action��Ĭ�Ϸ���");
		return SUCCESS;
	}
	
	public String show()throws Exception{
		System.out.println("ִ����CheLiangAction show����");
		return SUCCESS;
	}

}
