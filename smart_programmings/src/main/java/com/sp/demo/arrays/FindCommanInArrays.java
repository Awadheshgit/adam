package com.sp.demo.arrays;

public class FindCommanInArrays {
	
	// This function prints common elements in ar1
    static void findCommon(int ar1[], int ar2[], int ar3[]) {

        // Initialize starting indexes for ar1[], ar2[] and ar3[]
        int i = 0, j = 0, k = 0;

        // Iterate through three arrays while all arrays have elements
        while (i < ar1.length && j < ar2.length && k < ar3.length) {
            // If x = y and y = z, print any of them and move ahead
            // in all arrays
            if (ar1[i] == ar2[j] && ar2[j] == ar3[k]) {
                System.out.print(ar1[i]+" ");
                i++;
                j++;
                k++;
            }
            // x < y
            else if (ar1[i] < ar2[j])
                i++;
            // y < z
            else if (ar2[j] < ar3[k])
                j++;

            // We reach here when x > y and z < y, i.e., z is smallest
            else
                k++;
        }

    }
    // Driver code to test above
    public static void main(String args[]) {

    	//FindCommanInArrays ob = new FindCommanInArrays();
        int[] ar1 ={1,2,3,4,};
        int[] ar2 = {1,2,5,6,7};
        int[] ar3 = {1,5,2,8,9,10};

        System.out.print("Common elements are = ");
        findCommon(ar1, ar2, ar3);

    }


}
