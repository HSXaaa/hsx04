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
		System.out.println("ѧ������");
		name="ѧ������";
		return SUCCESS;
	}
	
	public String add()throws Exception{
		System.out.println("ѧ�����");
		name="ѧ�����";
		return SUCCESS;
	}
	
	public String update()throws Exception{
		System.out.println("ѧ���޸�");
		name="ѧ���޸�";
		return SUCCESS;
	}
	
	public String delete()throws Exception{
		System.out.println("ѧ��ɾ��");
		name="ѧ��ɾ��";
		return SUCCESS;
	}

	
}
