package com.sam;

public interface Task2 {
	public void showApp();
	public default void showData() {
		System.out.println("default");
	}

}
