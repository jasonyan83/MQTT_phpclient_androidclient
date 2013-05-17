/**
 * 
 * FileName NotifyActivity.java  <br />
 * @author Mr.Wen <br />
 * @version 1.0   <br />
 * @created 2013-5-15 上午11:19:18 <br />
 * 
 */
package com.example.testpush;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * 
 * @author Mr.Wen <br />
 * @version 1.0 <br />
 * @created 2013-5-15 上午11:19:18 <br />
 * 
 */
public class NotifyActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_notify);

		String strMsg = getIntent().getStringExtra("msg");
		TextView mMessage = (TextView) findViewById(R.id.txtNotify);
		mMessage.setText(strMsg);
	}
}