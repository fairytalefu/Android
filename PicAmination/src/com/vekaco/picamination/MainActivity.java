package com.vekaco.picamination;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {
	ImageView imageView;
	AnimationDrawable animationDrawable;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		imageView = (ImageView) findViewById(R.id.image);
		imageView.setBackgroundResource(R.drawable.amination);
		animationDrawable = (AnimationDrawable) imageView.getBackground();
		imageView.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (animationDrawable.isRunning()) {
					animationDrawable.stop();
				} else {
					animationDrawable.start();
				}
			}
		});
		// animationDrawable.start();
	}

}
