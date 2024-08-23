package com.ajwalker.dip.dip_sorulari;

public class Runner {
	public static void main(String[] args) {
		EmailSender emailSender = new EmailSender();
		SmsSender smsSender = new SmsSender();
		NotificationService notificationService = new NotificationService(smsSender);
		notificationService.sendNotification("Al bunu gönder");
	}
}