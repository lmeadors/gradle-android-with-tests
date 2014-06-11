package com.sample.app.test;

import android.test.ActivityInstrumentationTestCase2;

import com.sample.app.MainActivity;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

	public MainActivityTest() {
		super(MainActivity.class);
	}

	public void testSomeMethodInClass() throws Exception {
		assertNotNull(getActivity());
	}

}
