package com.faisal.MaxAndFrequency.Max_and_frequency;

import java.util.Arrays;

public class Frequency {
	

	public int leastFrequent(int[] arr, int size) {
		// TODO Auto-generated method stub

		if (size < 1) {
			System.out.println("No element in the array");
		}

		Arrays.sort(arr);

		int minFreqCount = size + 1, res = -52354;// taking any random negative integer
		int currentIndexCount = 1;
		// loop chalaye min frequency ber krbo
		for (int i = 1; i < size; i++) {
			if (arr[i] == arr[i - 1])
				currentIndexCount++;
			else {
				if (currentIndexCount < minFreqCount) {
					// jokhoni current ta min er cheye kom pabo tokhoni seta update korte thakbo
					minFreqCount = currentIndexCount;
					res = arr[i - 1];
				}

				currentIndexCount = 1;
			}
		}

		// If last element is least frequent
		if (currentIndexCount < minFreqCount) {
			minFreqCount = currentIndexCount;
			res = arr[size - 1];
		}

		return res;
	}

	public int mostFrequent(int[] arr, int size) {
		// TODO Auto-generated method stub

		if (size < 1) {
			System.out.println("No element in the array");
		}
		Arrays.sort(arr);

		int maxFreqCount = 1, res = arr[0];
		int currentIndexCount = 1;

		for (int i = 1; i < size; i++) {
			if (arr[i] == arr[i - 1])
				currentIndexCount++;
			else {
				if (currentIndexCount > maxFreqCount) {
					maxFreqCount = currentIndexCount;
					res = arr[i - 1];
				}
				currentIndexCount = 1;
			}
		}

		// If last element is most frequent
		if (currentIndexCount > maxFreqCount) {
			maxFreqCount = currentIndexCount;
			res = arr[size - 1];
		}

		return res;
	}

}
