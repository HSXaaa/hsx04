package hsx.com.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	private String name;
	private String error;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		if(name==null || "".equals(name)) {
			this.error="name «ø’";
			return ERROR;
		}
		return SUCCESS;
	}

	public String r()throws Exception{
		return "r";
	}
	
	public String c()throws Exception{
		return "c";	
	}
	
	public String ra()throws Exception{
		return "ra";	
	}
	
}
