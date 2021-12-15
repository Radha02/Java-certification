package com.lt.hybrid;

public interface TestB extends TestA {
	public default void TestB() {
		System.out.println("TESTB interface");
	}
}
