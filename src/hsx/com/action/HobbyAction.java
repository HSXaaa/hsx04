package hsx.com.action;

import com.opensymphony.xwork2.Action;

public class HobbyAction implements Action{

    private String[] hobby;
    
	public String[] getHobby() {
		return hobby;
	}

	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}
	
	public String execute() throws Exception {
		System.out.println("ִ����HoppyAction��Ĭ�Ϸ���");
		if(hobby!=null) {
		for(String h:hobby) {
		System.out.println(h);	
		}
	}
		return SUCCESS;
	}

}
