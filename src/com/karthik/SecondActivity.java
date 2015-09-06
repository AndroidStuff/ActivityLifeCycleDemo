package com.karthik;

import android.os.Bundle;

public class SecondActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
	}

	@Override
	public String tag() {
		return "SecondActivity";
	}

}
