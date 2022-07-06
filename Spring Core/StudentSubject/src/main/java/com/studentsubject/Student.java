package com.studentsubject;

public class Student {
	
		private int rollno;
		private String name;
		private String dob;
		private String classname;
		private String section;
		private Subject subject;
		
		
		public int getRollno() {
			return rollno;
		}
		public void setRollno(int rollno) {
			this.rollno = rollno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDob() {
			return dob;
		}
		public void setDob(String dob) {
			this.dob = dob;
		}
		public String getClassname() {
			return classname;
		}
		public void setClassname(String classname) {
			this.classname = classname;
		}
		public String getSection() {
			return section;
		}
		public void setSection(String section) {
			this.section = section;
		}
		public Subject getSubject() {
			return subject;
		}
		public void setSubject(Subject subject) {
			this.subject = subject;
		}
		
		public void display() {
			System.out.println("RollNo: "+rollno);
			System.out.println("Name: "+name);
			System.out.println("Date of Birth: "+dob);
			System.out.println("ClassName: "+classname);
			System.out.println("Section: "+section);
			
			System.out.println(subject);
			subject.displayTotal();
			
		}
}
