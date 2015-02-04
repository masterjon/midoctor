package com.midoctor.proyectdoc2;
import com.midoctor.proyectdoc2.R;

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
	    final Button button2 = (Button) findViewById(R.id.btalergologo);
	    button2.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	            // Perform action on click   
	        	
	        	Intent visitas = new Intent(getApplicationContext(), ListaMedicosActivity.class);
	            visitas.putExtra("especialidad", "alergologo");
				startActivity(visitas);
	        	
	          
	        }
	    });

	    final Button button3 = (Button) findViewById(R.id.btnaudiologo);
	    button3.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	            // Perform action on click   
	        	
	        	Intent visitas = new Intent(getApplicationContext(), ListaMedicosActivity.class);
	            visitas.putExtra("especialidad", "audiologo");
				startActivity(visitas);
	        	
	          
	        }
	    });
	    
	    final Button button4 = (Button) findViewById(R.id.btncardiologo);
	    button4.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	            // Perform action on click   
	        	
	        	Intent visitas = new Intent(getApplicationContext(), ListaMedicosActivity.class);
	            visitas.putExtra("especialidad", "cardiologo");
				startActivity(visitas);
	        	
	          
	        }
	    });
	    final Button button5 = (Button) findViewById(R.id.btncirujano);
	    button5.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	            // Perform action on click   
	        	
	        	Intent visitas = new Intent(getApplicationContext(), ListaMedicosActivity.class);
	            visitas.putExtra("especialidad", "cirujano");
				startActivity(visitas);
	        	
	          
	        }
	    });
	    final Button button6 = (Button) findViewById(R.id.btndermatologo);
	    button6.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	            // Perform action on click   
	        	
	        	Intent visitas = new Intent(getApplicationContext(), ListaMedicosActivity.class);
	            visitas.putExtra("especialidad", "dermatologo");
				startActivity(visitas);
	        	
	          
	        }
	    });
	    final Button button7 = (Button) findViewById(R.id.btnendrocinologo);
	    button7.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	            // Perform action on click   
	        	
	        	Intent visitas = new Intent(getApplicationContext(), ListaMedicosActivity.class);
	            visitas.putExtra("especialidad", "endocrinologo");
				startActivity(visitas);
	        	
	          
	        }
	    });
	    final Button button8 = (Button) findViewById(R.id.btngastro);
	    button8.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	            // Perform action on click   
	        	
	        	Intent visitas = new Intent(getApplicationContext(), ListaMedicosActivity.class);
	            visitas.putExtra("especialidad", "gastro");
				startActivity(visitas);
	        	
	          
	        }
	    });
	    final Button button9 = (Button) findViewById(R.id.btnginecologo);
	    button9.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	            // Perform action on click   
	        	
	        	Intent visitas = new Intent(getApplicationContext(), ListaMedicosActivity.class);
	            visitas.putExtra("especialidad", "ginecologo");
				startActivity(visitas);
	        	
	          
	        }
	    });
	    final Button button10 = (Button) findViewById(R.id.btnhematologo);
	    button10.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	            // Perform action on click   
	        	
	        	Intent visitas = new Intent(getApplicationContext(), ListaMedicosActivity.class);
	            visitas.putExtra("especialidad", "hematologo");
				startActivity(visitas);
	        	
	          
	        }
	    });
	    final Button button11 = (Button) findViewById(R.id.btninmunologo);
	    button11.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	            // Perform action on click   
	        	
	        	Intent visitas = new Intent(getApplicationContext(), ListaMedicosActivity.class);
	            visitas.putExtra("especialidad", "inmunologo");
				startActivity(visitas);
	        	
	          
	        }
	    });
	    final Button button12 = (Button) findViewById(R.id.btnneurocirujano);
	    button12.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	            // Perform action on click   
	        	
	        	Intent visitas = new Intent(getApplicationContext(), ListaMedicosActivity.class);
	            visitas.putExtra("especialidad", "neurocirujano");
				startActivity(visitas);
	        	
	          
	        }
	    });
	    final Button button13 = (Button) findViewById(R.id.btnneumologo);
	    button13.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	            // Perform action on click   
	        	
	        	Intent visitas = new Intent(getApplicationContext(), ListaMedicosActivity.class);
	            visitas.putExtra("especialidad", "neumologo");
				startActivity(visitas);
	        	
	          
	        }
	    });
	    final Button button14 = (Button) findViewById(R.id.btnneurologo);
	    button14.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	            // Perform action on click   
	        	
	        	Intent visitas = new Intent(getApplicationContext(), ListaMedicosActivity.class);
	            visitas.putExtra("especialidad", "neurologo");
				startActivity(visitas);
	        	
	          
	        }
	    });
	    final Button button15 = (Button) findViewById(R.id.btnnutriologo);
	    button15.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	            // Perform action on click   
	        	
	        	Intent visitas = new Intent(getApplicationContext(), ListaMedicosActivity.class);
	            visitas.putExtra("especialidad", "nutriologo");
				startActivity(visitas);
	        	
	          
	        }
	    });

	    final Button button17 = (Button) findViewById(R.id.btnoncologo);
	    button17.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	            // Perform action on click   
	        	
	        	Intent visitas = new Intent(getApplicationContext(), ListaMedicosActivity.class);
	            visitas.putExtra("especialidad", "oncologo");
				startActivity(visitas);
	        	
	          
	        }
	    });
	    final Button button18 = (Button) findViewById(R.id.btnortopedista);
	    button18.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	            // Perform action on click   
	        	
	        	Intent visitas = new Intent(getApplicationContext(), ListaMedicosActivity.class);
	            visitas.putExtra("especialidad", "ortopedista");
				startActivity(visitas);
	        	
	          
	        }
	    });
	    final Button button19 = (Button) findViewById(R.id.btnotorrino);
	    button19.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	            // Perform action on click   
	        	
	        	Intent visitas = new Intent(getApplicationContext(), ListaMedicosActivity.class);
	            visitas.putExtra("especialidad", "otorrino");
				startActivity(visitas);
	        	
	          
	        }
	    });
	    final Button button20 = (Button) findViewById(R.id.btnpsicologo);
	    button20.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	            // Perform action on click   
	        	
	        	Intent visitas = new Intent(getApplicationContext(), ListaMedicosActivity.class);
	            visitas.putExtra("especialidad", "psicologo");
				startActivity(visitas);
	        	
	          
	        }
	    });
	    final Button button21 = (Button) findViewById(R.id.btnreumatologo);
	    button21.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	            // Perform action on click   
	        	
	        	Intent visitas = new Intent(getApplicationContext(), ListaMedicosActivity.class);
	            visitas.putExtra("especialidad", "reumatologo");
				startActivity(visitas);
	        	
	          
	        }
	    });
	    final Button button22 = (Button) findViewById(R.id.btnterapiaped);
	    button22.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	            // Perform action on click   
	        	
	        	Intent visitas = new Intent(getApplicationContext(), ListaMedicosActivity.class);
	            visitas.putExtra("especialidad", "terapiaped");
				startActivity(visitas);
	        	
	          
	        }
	    });
	    final Button button23 = (Button) findViewById(R.id.btnurgenciasped);
	    button23.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	            // Perform action on click   
	        	
	        	Intent visitas = new Intent(getApplicationContext(), ListaMedicosActivity.class);
	            visitas.putExtra("especialidad", "urgenciasped");
				startActivity(visitas);
	        	
	          
	        }
	    });
	    final Button button24 = (Button) findViewById(R.id.btnurologo);
	    button24.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	            // Perform action on click   
	        	
	        	Intent visitas = new Intent(getApplicationContext(), ListaMedicosActivity.class);
	            visitas.putExtra("especialidad", "urologo");
				startActivity(visitas);
	        	
	          
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