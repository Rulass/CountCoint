package com.kata.cyberdojo;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class CoinTest {
	@Test
	public void testCalulateCoinsFor5Cent() {
		Coins countCoins = new Coins();
		String expected = "1 nickel | 5 pennies";
		String result = countCoins.changeOf(5);
		assertEquals(expected, result);
	}
	
	@Test
	public void testCalulateCoinsFor6Cent() {
		Coins countCoins = new Coins();
		String expected = "1 nickel y 1 pennies | 6 pennies";
		String result = countCoins.changeOf(6);
		assertEquals(expected, result);
	}
	
	@Test
	public void testCalulateCoinsFor7Cent() {
		Coins countCoins = new Coins();
		String expected = "1 nickel y 2 pennies | 7 pennies";
		String result = countCoins.changeOf(7);
		assertEquals(expected, result);
	}
	@Test
	public void testCalulateCoinsFor10Cent() {
		Coins countCoins = new Coins();
		String expected = "1 dime | 2 nickel | 1 nickel y 5 pennies | 10 pennies";
		String result = countCoins.changeOf(10);
		assertEquals(expected, result);
	}
	
	@Test
	public void testCalulateCoinsFor11Cent() {
		Coins countCoins = new Coins();
		String expected = "1 dime y 1 pennies | 2 nickel y 1 pennies | 1 nickel y 6 pennies | 11 pennies";
		String result = countCoins.changeOf(11);
		assertEquals(expected, result);
	}
	@Test
	public void testCalulateCoinsFor14Cent() {
		Coins countCoins = new Coins();
		String expected = "1 dime y 4 pennies | 2 nickel y 4 pennies | 1 nickel y 9 pennies | 14 pennies";
		String result = countCoins.changeOf(14);
		assertEquals(expected, result);
	}
	@Test
	public void testCalulateCoinsFor15Cent() {
		Coins countCoins = new Coins();
		String expected = "1 dime y 1 nickel | 1 dime y 5 pennies | 3 nickel | 2 nickel y 5 pennies | 1 nickel y 10 pennies | 15 pennies";
		String result = countCoins.changeOf(15);
		assertEquals(expected, result);
	}
	@Test 
	public void testCalulateCoinsFor19Cent() {
		Coins countCoins = new Coins();
		String expected = "1 dime y 1 nickel y 4 pennies | 1 dime y 9 pennies | 3 nickel y 4 pennies | 2 nickel y 9 pennies | 1 nickel y 14 pennies | 19 pennies";
		String result = countCoins.changeOf(19);
		assertEquals(expected, result);
	}
	
	@Test 
	public void testCalulateCoinsFor20Cent() {
		Coins countCoins = new Coins();
		String expected = "2 dime | 1 dime y 2 nickel | 1 dime y 1 nickel y 5 pennies | 1 dime y 10 pennies | 4 nickel | 3 nickel y 5 pennies | 2 nickel y 10 pennies | 1 nickel y 15 pennies | 20 pennies";
		String result = countCoins.changeOf(20);
		assertEquals(expected, result);
	}
	
	@Test @Ignore
	public void testCalulateCoinsFor24Cent() {
		Coins countCoins = new Coins();
		String expected = "2 dime y 4 pennies | 1 dime y 2 nickel y 4 pennies | 1 dime y 1 nickel y 9 pennies | 1 dime y 14 pennies | 4 nickel y 4 pennies | 3 nickel y 9 pennies | 2 nickel y 14 pennies | 1 nickel y 19 pennies | 24 pennies";
		String result = countCoins.changeOf(24);
		assertEquals(expected, result);
	}
	
}
