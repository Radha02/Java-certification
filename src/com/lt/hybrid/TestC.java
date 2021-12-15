package com.lt.hybrid;

public interface TestC extends TestA {
	public default void TestC() {
		System.out.println("TESTC interface");
	}
}
