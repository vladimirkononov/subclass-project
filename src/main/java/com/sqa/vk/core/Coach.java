package com.sqa.vk.core;

public class Coach extends SchoolFaculty {

	private String date;

	private String equipment;

	/**
	 * @param gender
	 * @param age
	 * @param occupation
	 */
	public Coach(String gender, int age, String occupation) {
		super(gender, age, occupation);
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return this.date;
	}

	/**
	 * @return the equipment
	 */
	public String getEquipment() {
		return this.equipment;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * @param equipment
	 *            the equipment to set
	 */
	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Coach [date=" + this.date + ", equipment=" + this.equipment + "]";
	}
}
