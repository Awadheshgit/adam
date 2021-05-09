package com.sp.demo.collections;

public class Demo {
	public static void main(String[] args) {
		
		String str = "Awadhesh";//hsehdawA

        String[] word = str.split(" ");

        for (int i = word.length-1; i >= 0; i--){
            System.out.print(word[i]);
        }
	}

}
