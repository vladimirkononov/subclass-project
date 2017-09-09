package com.sqa.vk.media;

public class Media {

	private String information;

	private String section;

	public Media() {
		super();
		this.section = "Politics";
		this.information = "Visit to Italy";
	}

	public Media(String section, String information) {
		super();
		this.section = section;
		this.information = information;
	}

	public void displayInformation() {
		System.out.println("This information can be found in " + this.section + ". The topic is " + "\""
				+ this.information + "\"");
	}

	public String getInformation() {
		return this.information;
	}

	public String getSection() {
		return this.section;
	}

	public void setInformation(String information) {
		this.information = information;
	}

	public void setSection(String section) {
		this.section = section;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " section " + this.section + ", information about " + "\""
				+ this.information + "\"";
	}
}
