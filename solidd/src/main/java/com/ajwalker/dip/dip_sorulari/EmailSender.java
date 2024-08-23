package com.ajwalker.dip.dip_sorulari;

public class EmailSender implements IMessageService{
	@Override
	public void sendMessage(String message) {
		System.out.println("Email sent to: "+ message);
	}
}