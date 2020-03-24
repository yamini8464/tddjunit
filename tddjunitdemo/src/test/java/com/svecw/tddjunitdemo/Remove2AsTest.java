package com.svecw.tddjunitdemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class Remove2AsTest {
	/*TODO list for my feature
	 * 1. ABCD => BCD
	 * 2. AACD => CD
	 * 3. BACD => BCD
	 * 4. BBAA => BBAA
	 * 5. AABAA => BAA
	 */
	@Test
	public void test2As1() {
		Remove2As remove2As = new Remove2As();
		assertEquals("BCD", remove2As.remov("ABCD"));
	}
	@Test
	public void test2As2() {
		Remove2As remove2As = new Remove2As();
		assertEquals("CD", remove2As.remov("AACD"));
	}
	@Test
	public void test2As3() {
		Remove2As remove2As = new Remove2As();
		assertEquals("BCD", remove2As.remov("BACD"));
	}
	@Test
	public void test2As4() {
		Remove2As remove2As = new Remove2As();
		assertEquals("BBAA", remove2As.remov("BBAA"));
	}
	@Test
	public void test2As5() {
		Remove2As remove2As = new Remove2As();
		assertEquals("BAA", remove2As.remov("AABAA"));
	}
	@Test
	public void test2As6() {
		Remove2As remove2As = new Remove2As();
		assertEquals("", remove2As.remov("AA"));
	}
}
