package com.sqa.vk.media;

public class Entertainment extends Television {

	private String program;

	public Entertainment() {
		super();
		this.program = "Holiwood Today!";
	}

	public Entertainment(int channel) {
		super();
		this.program = this.program;
	}

	public Entertainment(String program) {
		super();
		this.program = program;
	}

	public Entertainment(String section, String information, int channel, String program) {
		super(section, information, channel);
		this.program = program;
	}

	public String getProgram() {
		return this.program;
	}

	public void selectProgram() {
		System.out.println("Thank you for watching " + this.program);
	}

	public void setProgram(String program) {
		this.program = program;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " program " + "\"" + this.program + "\"";
	}
}
