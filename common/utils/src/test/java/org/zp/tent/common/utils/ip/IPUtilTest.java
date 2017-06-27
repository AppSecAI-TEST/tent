package org.zp.tent.common.utils.ip;

import org.junit.Test;

/**
 * @author victor zhang
 * @date 2017/6/27 17:35
 */
public class IPUtilTest {
	@Test
	public void test() {
        String ip = "112.80.248.74";
        String county = IPUtil.getCountry(ip);
        System.out.println(ip + " come from " + county);
    }
}
