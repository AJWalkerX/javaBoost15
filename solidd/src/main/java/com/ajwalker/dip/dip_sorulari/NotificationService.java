package com.ajwalker.dip.dip_sorulari;

public class NotificationService {
	private IMessageService messageSender;
	
	public NotificationService(IMessageService iMessageService){
		this.messageSender = iMessageService;
	}
	public void sendNotification(String message){
		messageSender.sendMessage(message);
	}
}