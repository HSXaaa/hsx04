package hsx.com.action;

import com.opensymphony.xwork2.Action;

public class HelloWorldAction implements Action{

	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String execute() throws Exception {
		System.out.println("ִ����Action��Ĭ�Ϸ���");
		return SUCCESS;
	}
}
