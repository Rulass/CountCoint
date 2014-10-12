package com.kata.cyberdojo;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CountCoinTest {

	@Test
	public void testCalulateCoinsFor1Cent() {
		CountCoins countCoins = new CountCoins();
		String expected = "1 pennie";
		String result = countCoins.changeOf(1);
		assertEquals(expected, result);
	}

}
