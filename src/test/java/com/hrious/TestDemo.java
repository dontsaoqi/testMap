package com.hrious;

import org.junit.Test;

import com.hrious.map.Demo1;
import com.hrious.map.Demo2;
import com.hrious.map.Demo3;

public class TestDemo {
	
	@Test
	public void test1() {
		Demo1 demo = new Demo1();
		demo.test1();
		demo.test2();
		demo.test3();
		demo.test4();
	}
	
	@Test
	public void test2() {
		Demo2 demo = new Demo2();
		demo.test1();
		demo.test2();
		demo.test3();
		demo.test4();
	}
	
	@Test
	public void test3() {
		Demo3 demo = new Demo3();
		demo.test1();
		demo.test2();
		demo.test3();
		demo.test4();
		demo.test5();
		demo.test6();
	}
}
