package com.faisal.MaxAndFrequency.Max_and_frequency;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxPairedProductTest {

	@Test
	public void testMaxPairedProduct() {
		MaxPairedProductFromAnArray obj = new MaxPairedProductFromAnArray();
		
		int arr[] = {2,3,1,5,2,6,-10};
		
		assertEquals(30, obj.maximumOfTwoProducts(arr, arr.length));
	}

}
