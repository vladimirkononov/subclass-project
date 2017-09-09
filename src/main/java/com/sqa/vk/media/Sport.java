package com.sqa.vk.media;

public class Sport extends Newspaper {

	private int page;

	public Sport() {
		super();
		this.page = 4;
	}

	public Sport(int page) {
		super();
		this.page = page;
	}

	public Sport(String section, String information, String title, int page) {
		super(section, information, title);
		this.page = page;
	}

	public int getPage() {
		return this.page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " page " + this.page;
	}
}
