package com.ajwalker.lsp.lsp_uygun3;

public class Araba implements IMotorluArac{
	@Override
	public void calistir() {
		System.out.println("Araba çalıştı");
	}
	
	@Override
	public void hizlan() {
		System.out.println("Araba hızlanıyor");
	}
}