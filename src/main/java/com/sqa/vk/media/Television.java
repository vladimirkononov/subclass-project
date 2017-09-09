package com.sqa.vk.media;

public class Television extends Media {

	private int channel;

	public Television() {
		super();
		this.channel = 704;
	}

	public Television(int channel) {
		super();
		this.channel = channel;
	}

	public Television(String section, String information, int channel) {
		super(section, information);
		this.channel = channel;
	}

	public int getChannel() {
		return this.channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public void switchChannel() {
		System.out.println("Tune TV to " + this.channel + " channel.");
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " channel " + this.channel;
	}
}
