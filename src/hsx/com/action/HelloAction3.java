package hsx.com.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction3 extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	private String name3;
	
	public String getName3() {
		return name3;
	}

	public void setName3(String name3) {
		this.name3 = name3;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("执行了HelloAction3的默认方法");
		return SUCCESS;
	}
	

}
