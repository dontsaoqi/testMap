package com.hrious.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Map工具类
 * 
 * @author wei
 *
 */
public class MapUtils {

	private MapUtils() {}
	
	/**
	 * 
	 * 测试产生1000000条数据
	 * key，value的值为String，从1-1000000
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
