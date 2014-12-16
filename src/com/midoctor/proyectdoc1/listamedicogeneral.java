package com.midoctor.proyectdoc1;

import com.midoctor.proyectdoc1.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;


public class listamedicogeneral extends Activity {
	
	
	
	private Button buttonpediatra;
	private Button buttonneonato;
	private Button buttonreuma;
	private Button buttonalergo;
	private Button buttoodonto;
	
	private  Button buttonREGRESAR;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.listamedicogeneral);
		 buttonpediatra = (Button) findViewById(R.id.btnpediatra);
		 buttonneonato = (Button) findViewById(R.id.btnneonatologo);
		 buttonreuma = (Button) findViewById(R.id.btnreuma);
		 buttonalergo = (Button) findViewById(R.id.btnalergo);
		 buttoodonto = (Button) findViewById(R.id.btnodonto);
		
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