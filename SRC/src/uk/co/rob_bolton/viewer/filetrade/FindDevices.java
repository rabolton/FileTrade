package uk.co.rob_bolton.viewer.filetrade;

import uk.co.rob_bolton.filetrade.R;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class FindDevices extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_find_devices);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.find_devices, menu);
		return true;
	}

}
