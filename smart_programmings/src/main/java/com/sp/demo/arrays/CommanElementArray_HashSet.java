package com.sp.demo.arrays;

import java.util.HashSet;

public class CommanElementArray_HashSet {
   public static void main(String[] args) {
	
	   int[] array1 = {4,3,7,9,2,4};//Two element same array common
	   int[] array2 = {5,1,4,8,3};
	   
	   HashSet<Integer> hs = new HashSet<Integer>();
	   
	   for(int i = 0; i<array1.length; i++) {
		   
		   for(int j = 0; j<array2.length; j++) {
			   
			   if(array1[i] == array2[j]) {
				   
				   hs.add(array1[i]);
				   break;//because of this huge of element then time will be less
			   }
		   }
	   }
	   for (Integer number : hs) {
		System.out.print(number+" ");// Output 3 4 only
	}
}
}
