package com.maven.sample.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class Tdd_JunitTest {
	Tdd_Junit object;
	@BeforeEach
	void setUp()
	{
		object = new Tdd_Junit();
	}
	

	@Test
	void test() {
		
		assertEquals("BCD",object.processing("ABCD"));
		
	}
	@Test
	void test1() {
		
		assertEquals("CD",object.processing("AACD"));
		
	}
	@Test
	void test2() {
		
		assertEquals("BCD",object.processing("BACD"));
		
	}
	@Test
	void test3() {
		
		assertEquals("BBAA",object.processing("BBAA"));
		
	}
	@Test
	void test4() {
		
		assertEquals("BAA",object.processing("AABAA"));
		
	}
	

}
