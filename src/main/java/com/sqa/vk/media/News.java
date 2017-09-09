package com.sqa.vk.media;

public class News extends Radio {

	private String station;

	public News() {
		super();
		this.station = "Oakland News";
	}

	public News(String station) {
		super();
		this.station = station;
	}

	public News(String section, String information, String forecast, String station) {
		super(section, information, forecast);
		this.station = station;
	}

	public String getStation() {
		return this.station;
	}

	public void liveNews() {
		System.out.println("You're listening " + this.station + " station.");
	}

	public void setStation(String station) {
		this.station = station;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " station " + "\"" + this.station + "\"";
	}
}
