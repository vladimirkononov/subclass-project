package com.sqa.vk.media;

import org.testng.annotations.*;

public class MediaTest {

	@Test
	public void testMedia() {
		Media[] news = new Media[4];
		news[0] = new Media();
		news[1] = new Newspaper("SF Chronichle", "World News", "Today in Rome...");
		news[2] = new News("Local News", "San Francisco today", "windy", "SF Chronicle");
		news[3] = new Entertainment("Fashion", "Music stars", 704, "E News");
		for (int i = 0; i < news.length; i++) {
			System.out.println(news[i]);
			System.out.println();
		}
		for (int i = 0; i < news.length; i++) {
			news[i].displayInformation();
			System.out.println();
		}
	}
}
