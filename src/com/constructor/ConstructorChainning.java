package com.constructor;

class Student{
	private String stdName;
	private int stdId;
	private String stdCollege;
	
	public Student() {
		this("Surya",513,"Avanthi");
	}
	public Student(String stdName, int stdId, String stdCollege) {
		this.stdName = stdName;
		this.stdId = stdId;
		this.stdCollege = stdCollege;
	}
	public String toString() {
		return "Student [stdName=" + stdName + ", stdId=" + stdId + ", stdCollege=" + stdCollege + "]";
	}
}


public class ConstructorChainning {
	public static void main(String[] args) {
		Student st = new Student();
		System.out.println(st);
	}
}
