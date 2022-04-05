package com.rajeev;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import org.junit.jupiter.api.Test;


public class FindMinMaxTest {
	MinMax testObject;
	@Test
	void test1() {
		testObject = FindMinMax.maxMinInArray(new int[] {1,3,56,26,32,755,0,4535,42,21});
		int[] expected = {0,4535};
		int[] actual = testObject.getMinMax();
		assertEquals(Arrays.toString(expected),Arrays.toString(actual));
	}
	@Test
	void test2() {
		testObject = FindMinMax.maxMinInArray(new int[] {12,46,78,123,7,2325,3232,7644,211235});
		int[] expected = {7,211235};
		int[] actual = testObject.getMinMax();
		assertEquals(Arrays.toString(expected),Arrays.toString(actual));
	}
	@Test
	void test3() {
		testObject = FindMinMax.maxMinInArray(new int[] {14,62,632,6344,776,2345,45232,4331});
		int[] expected = {14,45232};
		int[] actual = testObject.getMinMax();
		assertEquals(Arrays.toString(expected),Arrays.toString(actual));
	}
	@Test
	void test4() {
		testObject = FindMinMax.maxMinInArray(new int[] {1});
		int[] expected = {1,1};
		int[] actual = testObject.getMinMax();
		assertEquals(Arrays.toString(expected),Arrays.toString(actual));  }
	@Test
	void test5() {
		testObject = FindMinMax.maxMinInArray(new int[] {1234,12});
		int[] expected = {12,1234};
		int[] actual = testObject.getMinMax();
		assertEquals(Arrays.toString(expected),Arrays.toString(actual));
	}


}
