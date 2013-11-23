
package com.daybe.egg;

import android.app.Activity;
import android.os.Bundle;

public class EggActivity extends Activity {

	private EggView mEggView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		mEggView = new EggView(this);
		setContentView(mEggView);
	}

}
