package com.hrious.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.hrious.utils.MapUtils;

/**
 * 
 * 遍历Map的key
 * 
 * 通过遍历Map的keySet或entrySet进而对整个Map的key进行遍历
 * 使用iterator和foreach进行遍历
 * 
 * @author wei
 *
 */
public class Demo2 {

	static {
		System.out.println("-----遍历Map的key-----");
	}
	
	/**
	 * 采用iterator遍历keySet
	 */
	public void test1() {
		Map<String, String> map = MapUtils.generateMap();
		String key = null;
		
		long start = System.currentTimeMillis();
		
		Iterator<String> iter = map.keySet().iterator();
		while (iter.hasNext()) {
			key = iter.next();
		}
		
		long end = System.currentTimeMillis();
		System.out.println("采用iterator遍历keySet: " + (end - start) + " ms");
	}
	
	/**
	 * 采用foreach遍历keySet
	 */
	public void test2() {
		Map<String, String> map = MapUtils.generateMap();
		
		long start = System.currentTimeMillis();
		
		Set<String> keys = map.keySet();
		for (String key : keys) {
		}
		
		long end = System.currentTimeMillis();
		System.out.println("采用foreach遍历keySet: " + (end - start) + " ms");
	}
	
	/**
	 * 采用iterator遍历entrySet
	 */
	public void test3() {
		Map<String, String> map = MapUtils.generateMap();
		String key = null;
		
		long start = System.currentTimeMillis();
		
		Iterator<Entry<String, String>> iter = map.entrySet().iterator();
		while (iter.hasNext()) {
			key = iter.next().getKey();
		}
		
		long end = System.currentTimeMillis();
		System.out.println("采用iterator遍历entrySet: " + (end - start) + " ms");
	}
	
	/**
	 * 采用foreach遍历entrySet
	 */
	public void test4() {
		Map<String, String> map = MapUtils.generateMap();
		String key = null;
		
		long start = System.currentTimeMillis();
		
		Set<Entry<String, String>> entrys = map.entrySet();
		for (Entry<String, String> entry : entrys) {
			key = entry.getKey();
		}
		
		long end = System.currentTimeMillis();
		System.out.println("采用foreach遍历entrySet: " + (end - start) + " ms");
	}
}
