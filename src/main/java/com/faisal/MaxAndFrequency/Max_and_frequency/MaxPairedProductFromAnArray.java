package com.faisal.MaxAndFrequency.Max_and_frequency;

public class MaxPairedProductFromAnArray {
	

	public int maximumOfTwoProducts(int[] arr, int size) {
		// TODO Auto-generated method stub

		if (size < 2) {
			System.out.println("Pair is not possible without having two numbers");

		}

		int maximum_multiplication = Integer.MIN_VALUE; // min value ke max value diye replace korte thakbo. tai min ta
														// nilam

		int first_max = -9812379, second_max = -91238;// jekono random neg number nilam

		// protita pair er jonno loop chalacci
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				// update maximum product if required
				if (maximum_multiplication < arr[i] * arr[j]) {
					// jtokhn prjonto higher value pete thakbo, maximum_multiplication ta update
					// korte thakbo
					maximum_multiplication = arr[i] * arr[j];
					first_max = i;
					second_max = j;
				}
			}
		}

		System.out.print("The maximum pair from the array is " + arr[first_max] + " , " + arr[second_max]
				+ " and their product is " + arr[first_max] * arr[second_max]);
	
		return arr[first_max] * arr[second_max];
	}
}