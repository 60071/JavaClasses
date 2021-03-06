import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * 實作時間記錄：
 * 日期：<mm/dd>: <00:00>~<00:00>: <00:00>
 * 程式目標：
 * 設計規格：
 * 設計想法：
 * 虛擬碼：
 *  
 */

/**
 * @author ganrqunx
 *
 */
public class NumberSpeakerTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link NumberSpeaker#transScriptOf(int)}.
	 */
	@Test
	public void testTransScriptOf() {
		NumberSpeaker ns = new NumberSpeaker();
		/*
		 * 完整：123456789 => 一億兩千三百四十五萬六千七百八十九
		 * 中間有0的講法
		 * 101 => 一百零一 //單獨一個或多個就講一個零
		 * 最後有零的說法
		 * 
		 */
		assertEquals("一百二十三", ns.transScriptOf(123));
		assertEquals("負一百二十三", ns.transScriptOf(-123));
		assertEquals("一千零一", ns.transScriptOf(1001));
		assertEquals("負一萬零一", ns.transScriptOf(-10001));
		assertEquals("一萬零一百零一", ns.transScriptOf(10101));
		assertEquals("兩百二十二", ns.transScriptOf(222));
		assertEquals("負兩千零二", ns.transScriptOf(-2002));
		assertEquals("兩萬零兩百零二", ns.transScriptOf(20202));
		assertEquals("一億兩千三百四十五萬六千七百八十九", ns.transScriptOf(123456789));
		assertEquals("一億零兩萬兩千兩百二十二", ns.transScriptOf(100022222));
		assertEquals("負一", ns.transScriptOf(-1));
		assertEquals("零", ns.transScriptOf(0));
		assertEquals("二十", ns.transScriptOf(20));
		assertEquals("一億兩千萬", ns.transScriptOf(120000000));
		assertEquals("十萬", ns.transScriptOf(100000));
		assertEquals("十", ns.transScriptOf(10));
		assertEquals("十萬零兩百一十一", ns.transScriptOf(100211));
		assertEquals("負十萬零兩百一十一", ns.transScriptOf(-100211));
		assertEquals("負十", ns.transScriptOf(-10));
		assertEquals("負十億", ns.transScriptOf(-1000000000));
		assertEquals("二十億零一千萬", ns.transScriptOf(2010000000));
		ns = null;
	}

}
