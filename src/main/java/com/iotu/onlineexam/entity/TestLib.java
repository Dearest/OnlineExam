package com.iotu.onlineexam.entity;

public class TestLib {
	private int id;
	private String testid;
	private String topic;
	private int scores;
	private String reference;
	private String otheranswer;
	private String label;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTestid() {
		return testid;
	}
	public void setTestid(String testid) {
		this.testid = testid;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public int getScores() {
		return scores;
	}
	public void setScores(int scores) {
		this.scores = scores;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getOtheranswer() {
		return otheranswer;
	}
	public void setOtheranswer(String otheranswer) {
		this.otheranswer = otheranswer;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
}
