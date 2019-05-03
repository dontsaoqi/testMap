package com.hrious.map;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.hrious.utils.MapUtils;

/**
 * 
 * ����Map��value
 * 
 * ͨ������Map��keySet��entrySet��values����������Map��value���б���
 * ʹ��iterator��foreach���б���
 * 
 * @author wei
 *
 */
public class Demo3 {
	
	static {
		System.out.println("-----����Map��value-----");
	}
	
	/**
	 * ����iterator����keySet
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
		String value = null;
		Entry<String, String> entry = null;
		
		long start = System.currentTimeMillis();
		
		Iterator<Entry<String, String>> iter = map.entrySet().iterator();
		while (iter.hasNext()) {
			value = iter.next().getValue();
		}
		
		long end = System.currentTimeMillis();
		System.out.println("����iterator����entrySet: " + (end - start) + " ms");
	}
	
	/**
	 * ����foreach����entrySet
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
		System.out.println("����foreach����entrySet: " + (end - start) + " ms");
	}
	
	/**
	 * ����iterator����values
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
		System.out.println("����iterator����values " + (end - start) + " ms");
	}
	
	/**
	 * ����foreach����values
	 */
	public void test6() {
		Map<String, String> map = MapUtils.generateMap();
		
		long start = System.currentTimeMillis();
		
		Collection<String> coll = map.values();
		for (String value : coll) {
		}
		
		long end = System.currentTimeMillis();
		System.out.println("����foreach����values: " + (end - start) + " ms");
	}
}
