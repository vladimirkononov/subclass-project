package com.sqa.vk.core;

public class Counselor extends SchoolFaculty {

	private String name;

	private String lastName;

	/**
	 * @param gender
	 * @param age
	 * @param occupation
	 */
	public Counselor(String gender, int age, String occupation) {
		super(gender, age, occupation);
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return this.lastName;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Counselor [name=" + this.name + ", lastName=" + this.lastName + "]";
	}
}
