package com.ajwalker.week06.list_interface.stack;

import java.util.Scanner;
import java.util.Stack;

/*
* Kullanıcıdan alınan girdiye göre syntax doğruluğunu kontrol edecek methodu yazınız.
* girdi : () -> true
* girdi:
* */
public class Quest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Girdi giriniz: ");
		String input = sc.nextLine().trim();
		boolean sonuc = parantezKontrol1(input);
		System.out.println(sonuc);
	}
	
	private static boolean parantezKontrol(String input) {
		for (int i = 0; i < input.length()-1; i++){
			if (input.charAt(i) == '('){
				if (input.charAt(i+1) == ')'){
					return true;
				}
				
			}
		}
		for (int i = 0; i < input.length()-1; i++){
			if (input.charAt(i) == '{'){
				if (input.charAt(i+1) == '}'){
					return true;
				}
				
			}
		}
		for (int i = 0; i < input.length()-1; i++){
			if (input.charAt(i) == '['){
				if (input.charAt(i+1) == ']'){
					return true;
				}
				
			}
		}
		return false;
	}
	
	private static boolean parantezKontrol1(String girdi){
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i< girdi.length(); i++){
			char character = girdi.charAt(i);
			if (character == ')' || character == '}' ||character == ']'){
				if (stack.isEmpty()){
					return false;
				}
				else {
					Character topChar = stack.peek();
					
					if ((topChar == '(' && character == ')') ||
							(topChar == '[' && character == ']')||
							(topChar == '{' && character == '}'))
					{
						stack.pop();
					}
				}
			}
			else if (character == '(' || character == '{' ||character == '[') {
				stack.push(character);
			}
		}
		return stack.isEmpty();
	}
}