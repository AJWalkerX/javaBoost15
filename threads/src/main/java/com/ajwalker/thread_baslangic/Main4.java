package com.ajwalker.thread_baslangic;

public class Main4 {
	public static void main(String[] args){
		
		String name = "anonim";
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(name+" isimli thread çalıştı.");
				String activeThread = Thread.currentThread().getName();
				for (int i = 0; i < 10; i++) {
					
					try {
						//Thread.sleep(1000);
						System.out.println(i+":thread:"+activeThread);
					}
					catch (Exception e) {
						e.printStackTrace();
					}
					
				}
				System.out.println(activeThread+" Threadi çalışmayı bitirdi.");
			}
		});
		thread.start();
	}
	
}