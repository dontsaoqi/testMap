package com.hrious.map;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.hrious.utils.MapUtils;

/**
 * 
 * 遍历Map的value
 * 
 * 通过遍历Map的keySet或entrySet或values进而对整个Map的value进行遍历
 * 使用iterator和foreach进行遍历
 * 
 * @author wei
 *
 */
public class Demo3 {
	
	static {
		System.out.println("-----遍历Map的value-----");
	}
	
	/**
	 * 采用iterator遍历keySet
	 */
	public void test1() {
		Map<String, String> map = MapUtils.generateMap();
		String value = null;
		
		long start = System.currentTimeMillis();
		
		Iterator<String> iter = map.keySet().iterator();
		while (iter.hasNext()) {
			value = map.get(iter.next());
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
		String value = null;
		Entry<String, String> entry = null;
		
		long start = System.currentTimeMillis();
		
		Iterator<Entry<String, String>> iter = map.entrySet().iterator();
		while (iter.hasNext()) {
			value = iter.next().getValue();
		}
		
		long end = System.currentTimeMillis();
		System.out.println("采用iterator遍历entrySet: " + (end - start) + " ms");
	}
	
	/**
	 * 采用foreach遍历entrySet
	 */
	public void test4() {
		Map<String, String> map = MapUtils.generateMap();
		String value = null;
		
		long start = System.currentTimeMillis();
		
		Set<Entry<String, String>> entrys = map.entrySet();
		for (Entry<String, String> entry : entrys) {
			value = entry.getValue();
		}
		
		long end = System.currentTimeMillis();
		System.out.println("采用foreach遍历entrySet: " + (end - start) + " ms");
	}
	
	/**
	 * 采用iterator遍历values
	 */
	public void test5() {
		Map<String, String> map = MapUtils.generateMap();
		String value = null;
		
		long start = System.currentTimeMillis();
		
		Iterator<String> iter = map.values().iterator();
		while (iter.hasNext()) {
			value = iter.next();
		}
		
		long end = System.currentTimeMillis();
		System.out.println("采用iterator遍历values " + (end - start) + " ms");
	}
	
	/**
	 * 采用foreach遍历values
	 */
	public void test6() {
		Map<String, String> map = MapUtils.generateMap();
		
		long start = System.currentTimeMillis();
		
		Collection<String> coll = map.values();
		for (String value : coll) {
		}
		
		long end = System.currentTimeMillis();
		System.out.println("采用foreach遍历values: " + (end - start) + " ms");
	}
}
