package me.chongfeng.common.utils.concurrent;

import static org.assertj.core.api.Assertions.*;

import me.chongfeng.common.utils.base.ObjectUtil;
import org.junit.Test;

public class ThreadUtilTest {
	@Test
	public void testCaller(){
		hello();
		new MyClass().hello();
		assertThat(ThreadUtil.getCurrentClass()).isEqualTo("ThreadUtilTest");
		assertThat(ThreadUtil.getCurrentMethod()).isEqualTo("ThreadUtilTest.testCaller()");

	}

	private void hello(){
		assertThat(ThreadUtil.getCallerClass()).isEqualTo("ThreadUtilTest");
		assertThat(ThreadUtil.getCallerMethod()).isEqualTo("ThreadUtilTest.testCaller()");
		StackTraceElement[] stacktrace = Thread.currentThread().getStackTrace();
		System.out.println(ObjectUtil.toPrettyString(stacktrace));
	}

	public static class MyClass{
		public void hello(){
			assertThat(ThreadUtil.getCallerClass()).isEqualTo("ThreadUtilTest");
			assertThat(ThreadUtil.getCallerMethod()).isEqualTo("ThreadUtilTest.testCaller()");
			StackTraceElement[] stacktrace = Thread.currentThread().getStackTrace();
			System.out.println(ObjectUtil.toPrettyString(stacktrace));
		}
	}
}
