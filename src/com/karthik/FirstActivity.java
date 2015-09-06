package com.karthik;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class FirstActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first);
		
		Button buttonSecondActivity = (Button) findViewById(R.id.activity_first_button_goToSecondActivity);
		buttonSecondActivity.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent in = new Intent(FirstActivity.this, SecondActivity.class);
				startActivity(in);
			}});
	}

	@Override
	public String tag() {
		return "FirstActivity";
	}

}
