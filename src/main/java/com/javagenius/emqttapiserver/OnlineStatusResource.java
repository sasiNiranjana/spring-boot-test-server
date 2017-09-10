package com.javagenius.emqttapiserver;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OnlineStatusResource {
	@PostMapping("emqtt_update_status")
	public String submitOnlineStatus(@RequestBody OnlineRequestBody request){
		System.out.println("BodySerial is : "+request.getBodySerial());
		return "success";
	}
}
