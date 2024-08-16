package com.ajwalker.week03.diziler;

import java.util.Arrays;

/*
	{20,19,20,40,3,40,5,7,3} -> {20,19,40,3,5,7} {20,19,20,40,3,40,5,3,7,3}
**/
public class NoRepeatIndex {
	public static void main(String[] args) {
		int[] repeatNumArr = {20,19,20,40,3,40,5,7,3};
		int noRepeatArrLength = repeatNumArr.length;
		
		for (int i = 0; i < repeatNumArr.length; i++){
			for (int j = i+1; j < repeatNumArr.length; j++){
				if (repeatNumArr[i] == repeatNumArr[j]){
					noRepeatArrLength--;
					break;
				}
			}
		}
		int noRepeatArr[] = new int[noRepeatArrLength];
		int counter = 0;
		boolean isEquals;
		for (int i = 0; i < repeatNumArr.length; i++){
			isEquals = false;
			for (int j = i+1; j < repeatNumArr.length; j++){
				if (repeatNumArr[i] == repeatNumArr[j]){
					isEquals = true;
					break;
				}
			}
			if (!isEquals){
				noRepeatArr[counter]= repeatNumArr[i];
				counter++;
			}
		}
		System.out.println(Arrays.toString(noRepeatArr));
	}
	
}