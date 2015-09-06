package com.karthik;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public abstract class BaseActivity extends Activity {
	
	public abstract String tag();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d(tag(), "-- onCreate --");
	}

	@Override
	protected void onStart() {
		super.onStart();
		Log.d(tag(), "-- onStart --");
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		Log.d(tag(), "-- onRestart --");
	}

	@Override
	protected void onResume() {
		super.onResume();
		Log.d(tag(), "-- onResume --");
	}

	@Override
	protected void onPause() {
		super.onPause();
		Log.d(tag(), "-- onPause --");
	}

	@Override
	protected void onStop() {
		super.onStop();
		Log.d(tag(), "-- onStop --");
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Log.d(tag(), "-- onDestroy --");
	}

}
