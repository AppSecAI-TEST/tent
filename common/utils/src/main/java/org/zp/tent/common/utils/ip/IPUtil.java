package org.zp.tent.common.utils.ip;

import java.util.List;

/**
 * @author victor zhang
 * @date 2017/6/27 17:24
 */
public class IPUtil {

	private static IPSeeker ipseeker = IPSeeker.getInstance();;

	/**
	 * 根据IP得到国家名
	 *
	 * @param ip ip的字节数组形式
	 * @return 国家名字符串
	 */
	public static String getCountry(byte[] ip) {
		return ipseeker.getCountry(ip);
	}

	/**
	 * 根据IP得到国家名
	 *
	 * @param ip IP的字符串形式
	 * @return 国家名字符串
	 */
	public static String getCountry(String ip) {
		return ipseeker.getCountry(ip);
	}

	/**
	 * 根据IP得到地区名
	 *
	 * @param ip IP的字节数组形式
	 * @return 地区名字符串
	 */
	public static String getArea(byte[] ip) {
		return ipseeker.getArea(ip);
	}

	/**
	 * 根据IP得到地区名
	 *
	 * @param ip IP的字符串形式
	 * @return 地区名字符串
	 */
	public static String getArea(String ip) {
		return ipseeker.getArea(ip);
	}

	/**
	 * 给定一个地点的不完全名字，得到一系列包含s子串的IP范围记录
	 *
	 * @param s 地点子串
	 * @return 包含IPEntry类型的List
	 */
	public static List<IPEntry> getIPEntries(String s) {
		return ipseeker.getIPEntries(s);
	}

	/**
	 * 给定一个地点的不完全名字，得到一系列包含s子串的IP范围记录
	 *
	 * @param s 地点子串
	 * @return 包含IPEntry类型的List
	 */
	public static List<IPEntry> getIPEntriesDebug(String s) {
		return ipseeker.getIPEntriesDebug(s);
	}
}
