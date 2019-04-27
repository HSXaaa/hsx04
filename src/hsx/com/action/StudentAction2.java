package hsx.com.action;

import com.opensymphony.xwork2.ActionSupport;

public class StudentAction2 extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String list()throws Exception{
		System.out.println("学生查找");
		name="学生查找";
		return SUCCESS;
	}
	
	public String add()throws Exception{
		System.out.println("学生添加");
		name="学生添加";
		return SUCCESS;
	}
	
	public String update()throws Exception{
		System.out.println("学生修改");
		name="学生修改";
		return SUCCESS;
	}
	
	public String delete()throws Exception{
		System.out.println("学生删除");
		name="学生删除";
		return SUCCESS;
	}

	
}
