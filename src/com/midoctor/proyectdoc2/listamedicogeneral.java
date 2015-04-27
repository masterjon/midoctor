package com.midoctor.proyectdoc2;

import com.midoctor.proyectdoc2.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class listamedicogeneral extends Activity {
	
	
	
	private ImageButton buttonpediatra;
	private ImageButton buttonneonato;
	private ImageButton buttonreuma;
	private ImageButton buttonalergo;
	private ImageButton buttoodonto;
	
	private  Button buttonREGRESAR;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.listamedicogeneral);
		 buttonpediatra = (ImageButton) findViewById(R.id.btnpediatra);
		 buttonneonato = (ImageButton) findViewById(R.id.btnneonatologo);
		 buttonreuma = (ImageButton) findViewById(R.id.btnreuma);
		 buttonalergo = (ImageButton) findViewById(R.id.btnalergo);
		 buttoodonto = (ImageButton) findViewById(R.id.btnodonto);
		
		 buttonREGRESAR = (Button) findViewById(R.id.navegacionizq);
		buttonpediatra.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	        	
	            // Perform action on click   
	        	
	        	
	        	
	        	Intent visitas = new Intent(getApplicationContext(), pediatracirujano.class);
	        	visitas.putExtra("code", "pediatra");
	        	startActivity(visitas);
	        	finish();
	        	
	          
	        }
	    });
		
		buttonneonato.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	        	
	            // Perform action on click   
	        	
	        	
	        	
	        	Intent visitas = new Intent(getApplicationContext(), pediatracirujano.class);
	        	visitas.putExtra("code", "neonato");
				startActivity(visitas);
				finish();
	          
	        }
	    });
		
		buttonreuma.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	        	
	            // Perform action on click   
	        	
	        	
	        	Intent visitas = new Intent(getApplicationContext(), pediatracirujano.class);
	        	visitas.putExtra("code", "reuma");
				startActivity(visitas);
				finish();
	          
	        }
	    });
		
		buttonalergo.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	        	
	            // Perform action on click   
	        	
	        	
	        	
	        	Intent visitas = new Intent(getApplicationContext(), pediatracirujano.class);
	        	visitas.putExtra("code", "alergo");
	        	
				startActivity(visitas);
				finish();
	          
	        }
	    });
		
		buttoodonto.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	        	
	            // Perform action on click   
	        	
	        	
	        	
	        	Intent visitas = new Intent(getApplicationContext(), pediatracirujano.class);
	        	visitas.putExtra("code", "odonto");
				startActivity(visitas);
				finish();
	          
	        }
	    });
		
		  buttonREGRESAR.setOnClickListener(new View.OnClickListener() {
		        public void onClick(View v) {
		            // Perform action on click   
		        	
		        	Intent visitas = new Intent(getApplicationContext(), detalleespecialidadades.class);
					startActivity(visitas);
					finish();
		        	
		          
		        }
		    });
		
			
	}
	 @Override
	 public boolean onKeyUp(int keyCode, KeyEvent msg) {

	      switch(keyCode) {
	      case(KeyEvent.KEYCODE_BACK):
	           Intent a1_intent = new Intent(this, detalleespecialidadades.class);
	           startActivity(a1_intent);
	           finish();
	           return true; 
	      }
	      return false;
	 }
	

	
	
}