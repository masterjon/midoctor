package com.midoctor.proyectdoc2;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class ProximamenteActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_proximamente);
		 View view = this.getWindow().getDecorView();
		 view.setBackgroundResource(R.drawable.laboratorios_prox);
		 Bundle extras = getIntent().getExtras();
		 Integer type = extras.getInt("background");
		 if (type==1){
			 view.setBackgroundResource(R.drawable.hospitales_prox);
		 }
		 else if(type==2){
			 view.setBackgroundResource(R.drawable.laboratorios_prox);
		 }
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.proximamente, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
