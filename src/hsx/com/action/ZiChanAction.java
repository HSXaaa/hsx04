package hsx.com.action;

import com.opensymphony.xwork2.ActionSupport;

public class ZiChanAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		System.out.println("执行了ZiChanAction Action的默认方法");
		return SUCCESS;
	}

}
