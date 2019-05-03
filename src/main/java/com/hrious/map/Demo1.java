package com.hrious.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.hrious.utils.MapUtils;

/**
 * 
 * ����Map��key+value
 * 
 * ͨ������Map��keySet��entrySet����������Map���б���
 * ʹ��iterator��foreach���б���
 * 
 * @author wei
 *
 */
public class Demo1 {
	
	static {
		System.out.println("-----����Map��key+value-----");
	}
	
	/**
	 * ����iterator����keySet
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
		System.out.println("����iterator����keySet: " + (end - start) + " ms");
	}
	
	/**
	 * ����foreach����keySet
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
		System.out.println("����foreach����keySet: " + (end - start) + " ms");
	}
	
	/**
	 * ����iterator����entrySet
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
		System.out.println("����iterator����entrySet: " + (end - start) + " ms");
	}
	
	/**
	 * ����foreach����entrySet
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
		System.out.println("����foreach����entrySet: " + (end - start) + " ms");
	}
}
