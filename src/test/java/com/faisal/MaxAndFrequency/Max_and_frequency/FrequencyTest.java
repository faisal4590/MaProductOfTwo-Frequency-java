package com.faisal.MaxAndFrequency.Max_and_frequency;

import static org.junit.Assert.*;

import org.junit.Test;

public class FrequencyTest {

	@Test
	public void testFrequency() {
		Frequency ob = new Frequency();
		int arr[] = {2,3,1,2,2,6,1,6};
		
		//testting most frequent
		assertEquals(2, ob.mostFrequent(arr, arr.length));
		
		//testting least frequent
		assertEquals(3, ob.leastFrequent(arr, arr.length));
	}

}
