package com.midoctor.proyectdoc1;
import com.midoctor.proyectdoc1.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;



public class detalleespecialidadades extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.detalleespecialidades);
		
		final Button button = (Button) findViewById(R.id.btnped);
	    button.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	            // Perform action on click   
	        	
	        	Intent visitas = new Intent(getApplicationContext(), listamedicogeneral.class);
				startActivity(visitas);
	        	finish();
	          
	        }
	    });
		
			
	}
	
	 @Override
	 public boolean onKeyUp(int keyCode, KeyEvent msg) {

	      switch(keyCode) {
	      case(KeyEvent.KEYCODE_BACK):
	           Intent a1_intent = new Intent(this, especalidadades.class);
	           startActivity(a1_intent);
	           finish();
	           return true; 
	      }
	      return false;
	 }

	
}