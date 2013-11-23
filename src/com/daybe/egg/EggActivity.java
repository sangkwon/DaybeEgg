
package com.daybe.egg;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class EggActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.egg);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.egg, menu);
		return true;
	}

}
