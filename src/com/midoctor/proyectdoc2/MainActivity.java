package com.midoctor.proyectdoc2;
import com.midoctor.proyectdoc2.R;

//import android.support.v4.app.Fragment;
import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;

//MainActivity ---> especialidades.java(activity_opcionesmenu.xml) ---> detalleespecialidades 
//---> ListamedicoGeneral ---> Pediatracirujano ---> adapterdirectorio 
public class MainActivity extends Activity {
	
	private Spinner ListViewciudad;
	
	String[] values = new String[] {"Selecciona tu ciudad","Cancún", "Playa del Carmen", "Chetumal",
	        "Mérida" }; 
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		
		ListViewciudad = (Spinner) findViewById(R.id.Spinnerciudad);
		
		ImageButton btnlink = (ImageButton) findViewById(R.id.botondoctorizate);
		btnlink.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	        	Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.directoriomidoctor.com/doctorizate/"));
				startActivity(browserIntent);
	      }});
		
		ImageButton btnface = (ImageButton) findViewById(R.id.face);
		btnface.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	        	Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/TuDoctor"));
				startActivity(browserIntent);
	      }});
		
		ImageButton btntwitter = (ImageButton) findViewById(R.id.twitter);
		btntwitter.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	        	Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/TuDoctor_"));
				startActivity(browserIntent);
	      }});
		 final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
		android.R.layout.simple_spinner_item, values);
		 ListViewciudad.setPrompt("Elige tu ciudad");
		 ListViewciudad.setAdapter(adapter);	
		 
		
		 
		 
		 ListViewciudad.setOnItemSelectedListener(new OnItemSelectedListener() {
				public void onItemSelected(AdapterView<?> a, View v, int position,
						long id) {
					
					
				
					
					Integer indexValue = ListViewciudad.getSelectedItemPosition();
					
					if(indexValue == 1)
					{
						Log.e(null, indexValue.toString());
					 Intent homepage = new Intent(getApplicationContext(),
								especalidadades.class);
					       startActivity(homepage);
					       finish();
					       
					}
					else if(indexValue > 1){
						Log.e(null, indexValue.toString());
						 Intent homepage = new Intent(getApplicationContext(),
									CiudadActivity.class);
						       startActivity(homepage);
						      
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
