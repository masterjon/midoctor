package com.midoctor.proyectdoc1;
import com.midoctor.proyectdoc1.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class fichadoctor extends Activity {
	
	
	 private ImageView hImageViewPic , logo;
	    private Button iButton, gButton;
	    private TextView texttitulo;
	    private TextView  textdireccion;
	    private TextView   texttelefono;
	    private TextView  textemail;
	    String id;
	    String nombre;
	    String especialidad;
	    String direccion ;
	    String  correo ;
	    String  telefono;
	    private int currentImage = 0;
	    int[] images = { R.drawable.francisco1, R.drawable.francisco2, R.drawable.francisco3,R.drawable.francisco4,R.drawable.francisco5};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fichadoctor);
		
		 id = this.getIntent().getStringExtra("id");
		 nombre = this.getIntent().getStringExtra("Nombre");
	     especialidad = this.getIntent().getStringExtra("especialidad");
	     direccion = this.getIntent().getStringExtra("direccion");
	     correo = this.getIntent().getStringExtra("correo");
	     telefono = this.getIntent().getStringExtra("telefono");
	   
		  hImageViewPic = (ImageView) findViewById(R.id.imageViewrisa);
		  logo =(ImageView) findViewById(R.id.tv_child);
		  iButton = (Button) findViewById(R.id.navegacionder1);
	      gButton = (Button) findViewById(R.id.navegacionizq1);
	      texttitulo = (TextView)findViewById(R.id.texttitulo);
	      textdireccion = (TextView)findViewById(R.id.direccion);
	      texttelefono = (TextView)findViewById(R.id.telefono);
	      textemail = (TextView)findViewById(R.id.email);
	      
	      textdireccion.setText(direccion);
	      texttelefono.setText(correo);
	      textemail.setText(telefono);
	        texttitulo.setText(nombre);
		  if (id.equals("5"))
		  {
			  logo.setImageResource(R.drawable.logodrfrancisco33); 
			  hImageViewPic.setImageDrawable( getResources().getDrawable(R.drawable.francisco1));
			  iButton.setOnClickListener(iButtonChangeImageListener);
		      gButton.setOnClickListener(gButtonChangeImageListener);
		  }
		  else
		  {
			  iButton.setVisibility(View.GONE);
			  gButton.setVisibility(View.GONE);
			  hImageViewPic.setImageDrawable( getResources().getDrawable(R.drawable.risa)); 
			  
			  if(especialidad.equals("Especialista Pediátrica"))
				{
				  logo.setImageResource(R.drawable.child3);
				}
				if(especialidad.equals("Pediatra"))
				{
					  logo.setImageResource(R.drawable.pediatra3);
				}
				if(especialidad.equals("Especialistadad en Odontopeditría"))
				{
					  logo.setImageResource(R.drawable.odontopediatra3);
				}
				if(especialidad.equals("Reomatologia Pediátrica"))
				{
					  logo.setImageResource(R.drawable.reumatologia3);
				}
				
				if(especialidad.equals("Medico Pediátra alergólogo") && id.equals("5"))
				{
					logo.setImageResource(R.drawable.logodrfrancisco);
				}
				
				if(especialidad.equals("Medico Pediátra alergólogo") && !id.equals("5"))
				{
					logo.setImageResource(R.drawable.pediatra3);
				}
				
				if(especialidad.equals("Pediátrica Neonatólogo")|| especialidad.equals("Neonatóloga"))
				{
					  logo.setImageResource(R.drawable.pediatra3);
				}
				if(!especialidad.equals("Reomatologia Pediátrica") && !especialidad.equals("Especialistadad en Odontopeditría") 
						&& !especialidad.equals("Pediatra") && !especialidad.equals("Especialista Pediátrica")
						&& !especialidad.equals("Pediátrica Neonatólogo") && !especialidad.equals("Neonatóloga")
						&& !especialidad.equals("Medico Pediátra alergólogo")
				        && !id.equals("5")
						)
				{
					  logo.setImageResource(R.drawable.child3);
				}
			  
			  
		  }
		
		 
		   
		   
	        
	        // Just set one Click listener for the image

	       
		
		
	
		
		
		
			
	}
	
	 View.OnClickListener iButtonChangeImageListener = new OnClickListener() {

         public void onClick(View v) {
             try {
                 // Increase Counter to move to next Image
                 currentImage++;

                 currentImage = currentImage % images.length;

                 hImageViewPic.setImageResource(images[currentImage]);

               
             } catch (Exception e) {

             }

         }

     };

     View.OnClickListener gButtonChangeImageListener = new OnClickListener() {

         public void onClick(View v) {
             try {
                 // Decrease Counter to move to previous Image
                 currentImage--;

                 currentImage = (currentImage + images.length) % images.length;

                 hImageViewPic.setImageResource(images[currentImage]);

                 

             } catch (Exception e) {

             }
         }
     };

     protected void onPause() {
         // TODO Auto-generated method stub
         super.onPause();
         
         finish();
     }
	
     @Override
	 public boolean onKeyUp(int keyCode, KeyEvent msg) {

	      switch(keyCode) {
	      case(KeyEvent.KEYCODE_BACK):
	           Intent a1_intent = new Intent(this, pediatracirujadodetalle.class);
	     a1_intent.putExtra("code", pediatracirujadodetalle.code);
	      //a1_intent.putExtra("Nobre", "Nobre");
	      //a1_intent.putExtra("especialidad","especialidad");
	       startActivity(a1_intent);
	           finish();
	           return true; 
	      }
	      return false;
	 }

    
}