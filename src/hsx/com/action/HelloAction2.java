package hsx.com.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction2 extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	private String name2;
	
	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		this.setName2("ÄãºÃ°¡");
		return SUCCESS;
	}

}
