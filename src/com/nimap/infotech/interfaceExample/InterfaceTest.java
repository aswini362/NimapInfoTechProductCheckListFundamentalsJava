package com.nimap.infotech.interfaceExample;

public class InterfaceTest {

	public static void main(String[] args) {
		Video video = new Video();
		video.setFileName("birthday.mp4");
		video.setTitle("aswini birthday");
		video.setUser(new User("aswini.com"));
		VideoProcessor processor = new VideoProcessor(new XVideoEncoder(), new SqlVideoDatabase(), new EmailService());
		processor.process(video);
	}

}
