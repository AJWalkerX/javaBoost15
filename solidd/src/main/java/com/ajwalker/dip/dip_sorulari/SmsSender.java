package com.ajwalker.dip.dip_sorulari;

public class SmsSender implements IMessageService{
	@Override
	public void sendMessage(String message) {
		System.out.println("SMS sent: "+ message);
	}
}