package hsx.com.action;

import com.opensymphony.xwork2.ActionSupport;

public class CheLiangAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		System.out.println("执行了CheLiangAction Action的默认方法");
		return SUCCESS;
	}
	
	public String show()throws Exception{
		System.out.println("执行了CheLiangAction show方法");
		return SUCCESS;
	}

}
