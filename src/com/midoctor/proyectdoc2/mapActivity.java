package com.midoctor.proyectdoc2;
import java.util.HashMap;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.SupportMapFragment;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.midoctor.proyectdoc2.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;

import android.widget.Toast;


public class mapActivity extends FragmentActivity {
private GoogleMap googleMap;

	 private HashMap <String, Marker> places_marker_map = new HashMap<String, Marker>();
	
	 private String code;
	 private String	coordenadasla;
	 private String	coordenadaslo;
	 private String direccion;
	 private String nombre;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	      super.onCreate(savedInstanceState);
	      setContentView(R.layout.fragment_map);
	      
	  	code = this.getIntent().getStringExtra("code");
	  	coordenadasla = this.getIntent().getStringExtra("coordenadasla");
	  	coordenadaslo = this.getIntent().getStringExtra("coordenadaslo");
	  	direccion = this.getIntent().getStringExtra("direccion");
	  	nombre = this.getIntent().getStringExtra("nombre");
	  	
	       try { 
	            if (googleMap == null) {
	             //  googleMap = ((MapFragment) getFragmentManager().
	             //  findFragmentById(R.id.map)).getMap();
	               
	               
	               android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
       	          SupportMapFragment mapFragment = (SupportMapFragment) fragmentManager
       	            .findFragmentById(R.id.map);
       	       googleMap = mapFragment.getMap();
	               
	               
	               
	            }
	             LatLng MEJORANDOLA = new LatLng(Double.parseDouble(coordenadasla) ,Double.parseDouble(coordenadaslo));
	            
	            googleMap.setMyLocationEnabled(true);
	            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(MEJORANDOLA,16));
	            googleMap.getUiSettings().setZoomControlsEnabled(false);
		
	            Marker marker = googleMap.addMarker(new MarkerOptions()
	         	.position(MEJORANDOLA)
         	.title(nombre)
	         	.snippet(direccion));
    		     places_marker_map.put("direccion", marker);

	      } catch (Exception e) {
	         e.printStackTrace();
	      }

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

		
	
	
	

	 public boolean onKeyUp(int keyCode, KeyEvent msg) {

	      switch(keyCode) {
	      case(KeyEvent.KEYCODE_BACK):
	    	  
	    
	    	  if(code.equals("gastro")){
			    	 Intent a1_intent = new Intent(this, ListaMedicosActivity.class);
				     a1_intent.putExtra("especialidad", code);
			       startActivity(a1_intent);
			           finish();
			           return true;
			    	
			     }
	    	  else if(code.equals("clinicas") || code.equals("laboratorios")){
	    		  //Intent a1_intent = new Intent(this, ClinicasActivity.class);
				    // a1_intent.putExtra("especialidad", code);
			       //startActivity(a1_intent);
			           finish();
			           return false;
	    	  }
			     else{
			    	 Intent a1_intent = new Intent(this, pediatracirujano.class);
				     a1_intent.putExtra("code", code);
			       startActivity(a1_intent);
			           finish();
			           return true;
			  }
	      }
	      return false;
	 }
	
}
