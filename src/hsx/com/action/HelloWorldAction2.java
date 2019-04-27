package hsx.com.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction2 extends ActionSupport{

	private static final long serialVersionUID=1L;
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String execute() throws Exception {
		System.out.println("执行了ActionSupport的默认方法");
		return SUCCESS;
	}
}
