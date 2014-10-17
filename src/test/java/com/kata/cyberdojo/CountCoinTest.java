package com.kata.cyberdojo;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class CountCoinTest {

	@Test
	public void testCalulateCoinsFor1Cent() {
		CountCoins countCoins = new CountCoins();
		String expected = "1 pennie";
		String result = countCoins.changeOf(1);
		assertEquals(expected, result);
	}
	@Test
	public void testCalulateCoinsFor2Cent() {
		CountCoins countCoins = new CountCoins();
		String expected = "2 pennie";
		String result = countCoins.changeOf(2);
		assertEquals(expected, result);
	}
	@Test
	public void testCalulateCoinsFor3Cent() {
		CountCoins countCoins = new CountCoins();
		String expected = "3 pennie";
		String result = countCoins.changeOf(3);
		assertEquals(expected, result);
	}
	@Test
	public void testCalulateCoinsFor4Cent() {
		CountCoins countCoins = new CountCoins();
		String expected = "4 pennie";
		String result = countCoins.changeOf(4);
		assertEquals(expected, result);
	}
	@Test
	public void testCalulateCoinsFor5Cent() {
		CountCoins countCoins = new CountCoins();
		String expected = "1 nickel o 5 pennie";
		String result = countCoins.changeOf(5);
		assertEquals(expected, result);
	}
	@Test
	public void testCalulateCoinsFor6Cent() {
		CountCoins countCoins = new CountCoins();
		String expected = "1 nickel y 1 pennie o 6 pennie";
		String result = countCoins.changeOf(6);
		assertEquals(expected, result);
	}
	@Test
	public void testCalulateCoinsFor7Cent() {
		CountCoins countCoins = new CountCoins();
		String expected = "1 nickel y 2 pennie o 7 pennie";
		String result = countCoins.changeOf(7);
		assertEquals(expected, result);
	}
	
	@Test
	public void testCalulateCoinsFor10Cent() {
		CountCoins countCoins = new CountCoins();
		String expected = "1 dime o 2 nickel o 1 nickel y 5 pennie o 10 pennie";
		String result = countCoins.changeOf(10);
		assertEquals(expected, result);
	}
	@Test 
	public void testCalulateCoinsFor11Cent() {
		CountCoins countCoins = new CountCoins();
		String expected = "1 dime y 1 pennie o 2 nickel y 1 pennie o 1 nickel y 6 pennie o 11 pennie";
		String result = countCoins.changeOf(11);
		assertEquals(expected, result);
	}
	@Test
	public void testCalulateCoinsFor25Cent() {
		CountCoins countCoins = new CountCoins();
		String expected = "1 quarter";
		String result = countCoins.changeOf(25);
		assertEquals(expected, result);
	}
}
