package com.midoctor.proyectdoc1;
import com.midoctor.proyectdoc1.R;

import android.support.v4.app.Fragment;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;


public class MainActivity extends Activity {
	
	private Spinner ListViewciudad;
	
	String[] values = new String[] {"Selecciona tu ciudad","Cancún", "Playa del Carmen", "Chetumal",
	        "Mérida" }; 
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		
		ListViewciudad = (Spinner) findViewById(R.id.Spinnerciudad);
		
		
		 final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
		android.R.layout.simple_spinner_item, values);
		 ListViewciudad.setPrompt("Elige tu ciudad");
		 ListViewciudad.setAdapter(adapter);	
		 
		
		 
		 
		 ListViewciudad.setOnItemSelectedListener(new OnItemSelectedListener() {
				public void onItemSelected(AdapterView<?> a, View v, int position,
						long id) {
					
					
				
					
					Integer indexValue = ListViewciudad.getSelectedItemPosition();
					
					if(indexValue>0)
					{
					 Intent homepage = new Intent(getApplicationContext(),
								especalidadades.class);
					       startActivity(homepage);
					       finish();
					       
					}
					
					
                  
					

				}

				public void onNothingSelected(AdapterView<?> parent) {

				}
			});
		 
		

		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
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

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		
	}
	
	 @Override
	 public boolean onKeyUp(int keyCode, KeyEvent msg) {

	      switch(keyCode) {
	      case(KeyEvent.KEYCODE_BACK):
	           finish();
	           return true; 
	      }
	      return false;
	 }
	
}
