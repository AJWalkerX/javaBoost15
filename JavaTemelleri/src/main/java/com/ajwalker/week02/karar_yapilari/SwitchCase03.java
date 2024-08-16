package com.ajwalker.week02.karar_yapilari;

public class SwitchCase03 {
	public static void main(String[] args) {
		int num = 1, num2 = 10, num3 = 20, result;
		
		
		int switchResult = switch (num){
			case 1-> {
				result = num + num2;
				yield  result;
			}
			case 2-> {
				result = num2 - num3;
				yield result;
			}
			default -> throw new IllegalStateException("Hatali islem!");
		};
	}
}