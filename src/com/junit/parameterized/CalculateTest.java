package com.junit.parameterized;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class CalculateTest {
    
	private int expected;
	private int first;
	private int second;
	private static Calculate cal;
	public CalculateTest(int expected, int first, int second) {
		this.expected = expected;
		this.first = first;
		this.second = second;
	}
	
	@BeforeClass
	public static void initialize() {
		cal = new Calculate();
	}
	@Parameters
	public static Collection addedNumbers() {
		return Arrays.asList(new Integer[][] {{3, 1, 2}, {5, 2, 3}, {7, 3, 4}, {9, 4, 5}});
	}

	@Test
	public void sum() {
		System.out.println("first = " + first + "; second = " + second);
		assertEquals(expected, cal.sum(first, second));
	}
}
