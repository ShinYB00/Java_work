package kosa.course;

import java.util.ArrayList;
import java.util.List;

public class Course {
	
	private String cName; 
//	private String content;
	private List<Student> studentList;
	
	public Course() {}
	
	public Course(String cName) {
		super();
		this.cName = cName;
//		this.content = content;
		studentList = new ArrayList<Student>();
	}
	
	public void addStudent(Student student) {
		studentList.add(student);
	}
	
	public void removeStudent(Student student) {
		studentList.remove(student);
	}

	public void printCourse() {
		System.out.println("과목 : " + cName);
		for(Student student : studentList) {
			System.out.println("수강하는 학생 : " + student.getsName());
		}
		System.out.println();
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	
	
//	public String getContent() {
//		return content;
//	}
//
//	public void setContent(String content) {
//		this.content = content;
//	}

}
