package com.ajwalker.lsp.lsp_aykiri2;


public class Kare extends Dikdortgen{
	@Override
	public void setGenislik(int genislik) {
		super.setGenislik(genislik);
		super.setYukseklik(genislik);
	}
	
	@Override
	public void setYukseklik(int yukseklik) {
		super.setYukseklik(yukseklik);
		super.setGenislik(yukseklik);
		
	}
}