package com.example.deletableedittext;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.zyh.deletableedittext.R;

public class MainActivity extends ActionBarActivity {

	private DeleteableEditText et;
	private DeleteableEditText et1;
	private DeleteableEditText et2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		et = (DeleteableEditText) findViewById(R.id.et);
		et.setText("hhha");
		et1 = (DeleteableEditText) findViewById(R.id.et1);
		et1.setText("hhha");
		et2 = (DeleteableEditText) findViewById(R.id.et2);
		et2.setText("hhha");
	}
}
