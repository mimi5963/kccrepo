package kosa.video;

import java.io.Serializable;

public class Video implements Serializable{
	private int videoNum;
	private String title;
	private String actor;
	
	public Video() {}
	public Video(int videoNum, String title, String actor) {
		this.videoNum = videoNum;
		this.title = title;
		this.actor = actor;
	}
	public int getVideoNum() {
		return videoNum;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getActor() {
		return actor;
	}
	@Override
	public String toString() {
		return "Video [videoNum=" + videoNum + ", title=" + title + ", actor=" + actor + "]";
	}
	
	
	
}
