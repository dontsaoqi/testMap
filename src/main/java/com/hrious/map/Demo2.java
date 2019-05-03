package com.hrious.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.hrious.utils.MapUtils;

/**
 * 
 * ����Map��key
 * 
 * ͨ������Map��keySet��entrySet����������Map��key���б���
 * ʹ��iterator��foreach���б���
 * 
 * @author wei
 *
 */
public class Demo2 {

	static {
		System.out.println("-----����Map��key-----");
	}
	
	/**
	 * ����iterator����keySet
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
		System.out.println("����iterator����keySet: " + (end - start) + " ms");
	}
	
	/**
	 * ����foreach����keySet
	 */
	public void test2() {
		Map<String, String> map = MapUtils.generateMap();
		
		long start = System.currentTimeMillis();
		
		Set<String> keys = map.keySet();
		for (String key : keys) {
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
		
		long start = System.currentTimeMillis();
		
		Iterator<Entry<String, String>> iter = map.entrySet().iterator();
		while (iter.hasNext()) {
			key = iter.next().getKey();
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
		
		long start = System.currentTimeMillis();
		
		Set<Entry<String, String>> entrys = map.entrySet();
		for (Entry<String, String> entry : entrys) {
			key = entry.getKey();
		}
		
		long end = System.currentTimeMillis();
		System.out.println("����foreach����entrySet: " + (end - start) + " ms");
	}
}
