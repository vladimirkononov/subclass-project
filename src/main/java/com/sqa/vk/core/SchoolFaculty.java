package com.sqa.vk.core;

public class SchoolFaculty extends Employee {

	private String lecturer;

	private String professor;

	private String teacher;

	public SchoolFaculty(String gender, int age, String occupation) {
		super(gender, age, occupation);
	}

	/**
	 * @return the lecturer
	 */
	public String getLecturer() {
		return this.lecturer;
	}

	/**
	 * @return the professor
	 */
	public String getProfessor() {
		return this.professor;
	}

	/**
	 * @return the teacher
	 */
	public String getTeacher() {
		return this.teacher;
	}

	/**
	 * @param lecturer
	 *            the lecturer to set
	 */
	public void setLecturer(String lecturer) {
		this.lecturer = lecturer;
	}

	/**
	 * @param professor
	 *            the professor to set
	 */
	public void setProfessor(String professor) {
		this.professor = professor;
	}

	/**
	 * @param teacher
	 *            the teacher to set
	 */
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SchoolFaculty [lecturer=" + this.lecturer + ", professor=" + this.professor + ", teacher="
				+ this.teacher + "]";
	}
}
