package com.sqa.vk.media;

public class Newspaper extends Media {

	private String title;

	public Newspaper() {
		super();
		this.title = "Local News";
	}

	public Newspaper(String title) {
		super();
		this.title = title;
	}

	public Newspaper(String section, String information, String title) {
		super(section, information);
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	public void readTitle() {
		System.out.println("You're reading " + "\"" + this.title + "\"" + " newspaper.");
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " title " + "\"" + this.title + "\"";
	}
}
