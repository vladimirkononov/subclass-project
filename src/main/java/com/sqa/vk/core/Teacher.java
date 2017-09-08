package com.sqa.vk.core;

public class Teacher extends SchoolFaculty {

	private String homework;

	private String grade;

	/**
	 * @param gender
	 * @param age
	 * @param occupation
	 */
	public Teacher(String gender, int age, String occupation) {
		super(gender, age, occupation);
	}

	/**
	 * @return the grade
	 */
	public String getGrade() {
		return this.grade;
	}

	/**
	 * @return the homework
	 */
	public String getHomework() {
		return this.homework;
	}

	/**
	 * @param grade
	 *            the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}

	/**
	 * @param homework
	 *            the homework to set
	 */
	public void setHomework(String homework) {
		this.homework = homework;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Teacher [homework=" + this.homework + ", grade=" + this.grade + "]";
	}
}
