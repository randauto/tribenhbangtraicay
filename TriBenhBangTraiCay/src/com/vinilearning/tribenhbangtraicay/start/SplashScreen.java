package com.vinilearning.tribenhbangtraicay.start;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import com.vinilearning.tribenhbangtraicay.MainActivity;
import com.vinilearning.tribenhbangtraicay.factory.ThuocFactory;

public class SplashScreen extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		new Handler().postDelayed(new Runnable() {

			@Override
			public void run() {
				ThuocFactory thoFactory = ThuocFactory
						.getInstance(SplashScreen.this);
				ThuocFactory.lstThoVn = thoFactory.generationThuocVn();
				Log.i("Tong so", "" + ThuocFactory.lstThoVn.size());

				startActivity(new Intent(SplashScreen.this, MainActivity.class));
				finish();

			}
		}, 1500);
	}
}
