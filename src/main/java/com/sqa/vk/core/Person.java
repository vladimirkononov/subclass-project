package com.sqa.vk.core;

public class Person {

	private String gender;

	private int age;

	private String occupation;

	public Person(int age) {
		this.age = age;
	}
	// public Person(String gender) {
	// this.gender = gender;
	// }

	// public Person(String occupation) {
	// this.age = this.age;
	// }
	public Person(String gender, int age, String occupation) {
		super();
		this.gender = gender;
		this.age = age;
		this.occupation = occupation;
	}

	public int getAge() {
		return this.age;
	}

	public String getGender() {
		return this.gender;
	}

	public String getOccupation() {
		return this.occupation;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [gender=" + this.gender + ", age=" + this.age + ", occupation=" + this.occupation + "]";
	}
}
