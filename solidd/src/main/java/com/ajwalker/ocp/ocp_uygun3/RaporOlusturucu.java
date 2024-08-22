package com.ajwalker.ocp.ocp_uygun3;

public class RaporOlusturucu {
	public void raporOlustur(IRapor iRapor){
		iRapor.olustur();
	}
	
	public static void main(String[] args) {
		RaporOlusturucu r = new RaporOlusturucu();
		r.raporOlustur(new Excel());
	}
}