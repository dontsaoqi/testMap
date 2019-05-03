package com.hrious.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Map������
 * 
 * @author wei
 *
 */
public class MapUtils {

	private MapUtils() {}
	
	/**
	 * 
	 * ���Բ���1000000������
	 * key��value��ֵΪString����1-1000000
	 * 
	 * @return
	 */
	public static Map<String, String> generateMap() {
		Map<String, String> map = new HashMap<String, String>();
		for (int i = 1; i <= 1000000; i++) {
			map.put(Integer.toString(i), Integer.toString(i));
		}
		return map;
	}
	
}
