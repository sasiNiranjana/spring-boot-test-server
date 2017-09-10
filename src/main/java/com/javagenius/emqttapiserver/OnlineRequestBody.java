package com.javagenius.emqttapiserver;


public class OnlineRequestBody {
	private String bodySerial;
	private Boolean status;
	public String getBodySerial() {
		return bodySerial;
	}
	public void setBodySerial(String bodySerial) {
		this.bodySerial = bodySerial;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
}
