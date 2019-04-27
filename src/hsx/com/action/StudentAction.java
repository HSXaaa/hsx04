package hsx.com.action;

import java.util.List;

import hsx.com.model.Student;
import com.opensymphony.xwork2.Action;

public class StudentAction implements Action{

	private List<Student> students;
	
	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}


	@Override
	public String execute() throws Exception {
		System.out.println("执行了Action的默认方法");
		for(Student s:students){
			System.out.println(s);
		}
		return SUCCESS;
	}

}
