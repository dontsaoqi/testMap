package com.hrious.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.hrious.utils.MapUtils;

/**
 * 
 * 遍历Map的key+value
 * 
 * 通过遍历Map的keySet或entrySet进而对整个Map进行遍历
 * 使用iterator和foreach进行遍历
 * 
 * @author wei
 *
 */
public class Demo1 {
	
	static {
		System.out.println("-----遍历Map的key+value-----");
	}
	
	/**
	 * 采用iterator遍历keySet
	 */
	public void test1() {
		Map<String, String> map = MapUtils.generateMap();
		String key = null;
		String value = null;
		
		long start = System.currentTimeMillis();
		
		Iterator<String> iter = map.keySet().iterator();
		while (iter.hasNext()) {
			key = iter.next();
			value = map.get(key);
		}
		
		long end = System.currentTimeMillis();
		System.out.println("采用iterator遍历keySet: " + (end - start) + " ms");
	}
	
	/**
	 * 采用foreach遍历keySet
	 */
	public void test2() {
		Map<String, String> map = MapUtils.generateMap();
		String value = null;
		
		long start = System.currentTimeMillis();
		
		Set<String> keys = map.keySet();
		for (String key : keys) {
			value = map.get(key);
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
		String value = null;
		Entry<String, String> entry = null;
		
		long start = System.currentTimeMillis();
		
		Iterator<Entry<String, String>> iter = map.entrySet().iterator();
		while (iter.hasNext()) {
			entry = iter.next();
			key = entry.getKey();
			value = entry.getValue();
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
		String value = null;
		
		long start = System.currentTimeMillis();
		
		Set<Entry<String, String>> entrys = map.entrySet();
		for (Entry<String, String> entry : entrys) {
			key = entry.getKey();
			value = entry.getValue(); 
		}
		
		long end = System.currentTimeMillis();
		System.out.println("采用foreach遍历entrySet: " + (end - start) + " ms");
	}
}
