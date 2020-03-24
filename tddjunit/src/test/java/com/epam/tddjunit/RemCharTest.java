package com.epam.tddjunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RemCharTest {
	/*
	 * TODO List for REMOVING 'A' IF PRESENT IN FIRST TWO CHARCTERS
	 * 1 chars : 	 "ABCD" => "BCD"
	 * 2 chars :     "AABB" => "BB"
	 * 3 chars :     "AAAB" => "AB"
	 * 4 chars :     "AAAABB" => "AABB"
	 * n chars :     "AAAAAAB" => "AAAAB"
	 * empty   :     "" => ""
	 */
	Remove r;
	@BeforeEach
	void setUp()
	{
		r=new Remove();
	}
	@Test
	void test1Chars() {
		assertEquals("BCD",r.remove("ABCD"));
		
	}
	@Test
	void test2Chars() {
		assertEquals("BB",r.remove("AABB"));
		assertEquals("BCD",r.remove("BACD"));
	}
	@Test
	void test3Chars() {
		assertEquals("AB",r.remove("AAAB"));
	}
	@Test
	void test4Chars() {
		assertEquals("AABB",r.remove("AAAABB"));
	}
	@Test
	void testnChars() {
		assertEquals("AAAABB",r.remove("AAAAAABB"));
	}
	@Test
	void testEmptyChars() {
		assertEquals("",r.remove(""));
	}
}