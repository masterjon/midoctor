package com.midoctor.proyectdoc2;
import java.util.HashMap;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.midoctor.proyectdoc2.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Toast;


public class Fragment_mapActivity extends Activity {
private GoogleMap googleMap;

	private HashMap <String, Marker> places_marker_map = new HashMap<String, Marker>();
	 public static final LatLng MEJORANDOLA = new LatLng(21.150340750932934, -86.84832039890284);
	 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_map);
		
		
		
		try { 
            if (googleMap == null) {
               googleMap = ((MapFragment) getFragmentManager().
               findFragmentById(R.id.map)).getMap();
            }
         googleMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
         Marker TP = googleMap.addMarker(new MarkerOptions().
         position(MEJORANDOLA).title("TutorialsPoint"));

      } catch (Exception e) {
         e.printStackTrace();
      }
		
		
		
		
		
		
		
		
		
		
		
		
		//try {
		
		
//		android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
//	    SupportMapFragment mapFragment = (SupportMapFragment) fragmentManager
//	            .findFragmentById(R.id.map);
//	    map = mapFragment.getMap();
//		
//		map.setMyLocationEnabled(true);
//  		map.moveCamera(CameraUpdateFactory.newLatLngZoom(MEJORANDOLA,16));
//  		map.getUiSettings().setZoomControlsEnabled(false);
//		
//		 Marker marker = map.addMarker(new MarkerOptions()
//     	.position(MEJORANDOLA)
//     	.title("mejorandola")
//     	.snippet("ubicacion de mejorandola"));
//		    		  
//		  places_marker_map.put("ubicacion de mejorandola", marker);
//		}
//		catch(Exception ex){
//			
//			Toast.makeText(getApplicationContext(), ex.toString() , Toast.LENGTH_LONG).show();
//			Log.e("ServicioRest", "Error!", ex);
//		}
//		
//		
//		

		
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
	
	
	 @Override
	 public boolean onKeyUp(int keyCode, KeyEvent msg) {

	      switch(keyCode) {
	      case(KeyEvent.KEYCODE_BACK):
	    	  
	    	  Toast.makeText(getApplicationContext(), "regresar", Toast.LENGTH_LONG).show();
	      Intent a1_intent = new Intent(this, pediatracirujadodetalle.class);
          a1_intent.putExtra("code", "neonato");
          startActivity(a1_intent);     
	      finish();
	      
	      
	           return true; 
	      }
	      return false;
	 }
	
}
