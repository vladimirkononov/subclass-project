package com.sqa.vk.media;

public class Radio extends Media {

	private String forecast;

	public Radio() {
		super();
		this.forecast = "Local Weather";
	}

	public Radio(String forecast) {
		super();
		this.forecast = forecast;
	}

	public Radio(String section, String information, String forecast) {
		super(section, information);
		this.forecast = forecast;
	}

	public String getForecast() {
		return this.forecast;
	}

	public void setForecast(String forecast) {
		this.forecast = forecast;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " forecast " + this.forecast;
	}
}
