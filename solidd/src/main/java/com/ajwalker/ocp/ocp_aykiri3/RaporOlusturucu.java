package com.ajwalker.ocp.ocp_aykiri3;

public class RaporOlusturucu {
	public void raporOlustur(String raporTip){
		switch (raporTip){
			case "PDF":
				System.out.println("PDF");
				break;
			case "Word":
				System.out.println("Word");
				break;
			case "Excel":
				System.out.println("Excel");
				break;
			default:
				System.out.println("RaporTip yok!");
		}
	}
	
	public static void main(String[] args) {
		RaporOlusturucu r = new RaporOlusturucu();
		r.raporOlustur("PDF");
	}
}