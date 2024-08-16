package com.ajwalker.user_defined_exception;

public class Notlar {
	public static void main(String[] args) {
		try {
			notKontrol(120);
		}
		catch (NotOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println("Program devam ediyor 4");
	}
	
	private static void notKontrol(int not) throws NotOutOfBoundsException {
		if (not < 0 ||not > 100){
			//Kendimiz hata fırlatabilir!
			throw new NotOutOfBoundsException("not 0-100 arasında değil");
		}
		else{
			System.out.println("Not sorunsuz");
		}
	}
}