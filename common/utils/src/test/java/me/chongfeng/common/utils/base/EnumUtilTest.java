package me.chongfeng.common.utils.base;

import static org.assertj.core.api.Assertions.*;

import me.chongfeng.common.utils.collection.ListUtil;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class EnumUtilTest {

	public enum Options {
		A, B, C, D;
	}

	@Test
	public void test() {
		assertThat(EnumUtil.generateBits(Options.class, Options.A)).isEqualTo(1);
		assertThat(EnumUtil.generateBits(Options.class, Options.A, Options.B)).isEqualTo(3);

		Assertions.assertThat(EnumUtil.generateBits(Options.class, ListUtil.newArrayList(Options.A))).isEqualTo(1);
		assertThat(EnumUtil.generateBits(Options.class, ListUtil.newArrayList(Options.A, Options.B))).isEqualTo(3);

		assertThat(EnumUtil.processBits(Options.class, 3)).hasSize(2).containsExactly(Options.A, Options.B);
		assertThat(EnumUtil.processBits(Options.class,
				EnumUtil.generateBits(Options.class, Options.A, Options.C, Options.D))).hasSize(3)
						.containsExactly(Options.A, Options.C, Options.D);

	}

}
