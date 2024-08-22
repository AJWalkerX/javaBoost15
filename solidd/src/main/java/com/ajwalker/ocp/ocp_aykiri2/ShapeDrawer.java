package com.ajwalker.ocp.ocp_aykiri2;

public class ShapeDrawer {
	private String tip;
	
	public ShapeDrawer(String tip) {
		this.tip = tip;
	}
	public void draw(){
		if (tip.equalsIgnoreCase("daire")){
			daireCiz();
		}
		else if (tip.equalsIgnoreCase("kare")){
			kareCiz();
		}
		else if (tip.equalsIgnoreCase("ucgen")){
			ucgenCiz();
		}
	}
	
	private void ucgenCiz() {
		System.out.println("ucgen");
	}
	
	private void kareCiz() {
		System.out.println("kare");
	}
	
	private void daireCiz() {
		System.out.println("daire");
	}
}