package kosa.course;

import java.util.ArrayList;
import java.util.List;

public class Student {

	private String num;
	private String sName;
	private List<Course> courseList; // 학생이 수강신청한 과목들
	
	public Student() {}
	
	public Student(String num, String sName) {
		super();
		this.num = num;
		this.sName = sName;
		courseList = new ArrayList<Course>();
	}
	
	// 수강 등록하면서 학생도 추가가 된다
	public void register(Course course) {
		courseList.add(course);
		// 현재 자신의 객체인 this를 이용
		course.addStudent(this);
	}
	
	public void cancel(Course course) {
		if(courseList.contains(course)) {
			courseList.remove(course);
			course.removeStudent(this);
		}
	}
	
	public void print() {
		System.out.println("학생 번호 : " + num);
		System.out.println("학생 이름 : " + sName);
		for(Course course : courseList) {
			System.out.println("수강 과목 : " + course.getcName());
		}
		System.out.println();
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	
}
