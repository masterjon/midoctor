package com.midoctor.proyectdoc2;
import java.util.ArrayList;

import com.midoctor.proyectdoc2.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class fichadoctor extends Activity {
	
	private  ImageView   header;
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
	    String  code;
	    private int currentImage = 0;
	    ArrayList<Integer> imgs = new ArrayList<Integer>();
	   
	    
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
	     code = this.getIntent().getStringExtra("code");

	     
	     header = (ImageView) findViewById(R.id.tv_header);
		  hImageViewPic = (ImageView) findViewById(R.id.imageViewrisa);
		
		  iButton = (Button) findViewById(R.id.navegacionder1);
	      gButton = (Button) findViewById(R.id.navegacionizq1);
	     texttitulo = (TextView)findViewById(R.id.texttitulo);
	     /*  textdireccion = (TextView)findViewById(R.id.direccion);
	      texttelefono = (TextView)findViewById(R.id.telefono);
	      textemail = (TextView)findViewById(R.id.email);
	      
	      textdireccion.setText(direccion);
	      texttelefono.setText(correo);
	      textemail.setText(telefono);*/
	        texttitulo.setText(nombre);
	        
	        
	        
	         
		  if (id.equals("999999"))
		  {
			 
			  hImageViewPic.setImageDrawable( getResources().getDrawable(R.drawable.francisco1));
			  //iButton.setOnClickListener(iButtonChangeImageListener);
		      //gButton.setOnClickListener(gButtonChangeImageListener);
		  }
		  else
		  {
			 
			  hImageViewPic.setImageDrawable( getResources().getDrawable(R.drawable.risa)); 
			  
				
				if(nombre.equals("Dra. Eunice May Narvaez"))
				{
					header.setImageDrawable( getResources().getDrawable(R.drawable.header_peidatra));
					  hImageViewPic.setImageDrawable( getResources().getDrawable(R.drawable.eunicemay_slide1));
					 iButton.setVisibility(View.GONE);
					  gButton.setVisibility(View.GONE);
				}
				else if(nombre.equals("Dr. José Carlos Balmaceda L."))
				{
					header.setImageDrawable( getResources().getDrawable(R.drawable.header_peidatra));
					  hImageViewPic.setImageDrawable( getResources().getDrawable(R.drawable.josecarlosbalmaceda_slide1));

					 iButton.setVisibility(View.GONE);
					  gButton.setVisibility(View.GONE);
				}
				else if(nombre.equals("Dr. Raúl Medina Chávez"))
				{
					header.setImageDrawable( getResources().getDrawable(R.drawable.header_peidatra));
					hImageViewPic.setImageDrawable( getResources().getDrawable(R.drawable.raul_medina_slide1	));
					iButton.setVisibility(View.GONE);
					  gButton.setVisibility(View.GONE);
				}
				else if(nombre.equals("Dra. Genny Santamaría Berrón"))
				{
					header.setImageDrawable( getResources().getDrawable(R.drawable.header_peidatra));
					imgs.add(R.drawable.drageny_slide1);
					imgs.add(R.drawable.drageny_slide2);
					hImageViewPic.setImageDrawable( getResources().getDrawable(R.drawable.drageny_slide1));
					iButton.setOnClickListener(iButtonChangeImageListener);
				    gButton.setOnClickListener(gButtonChangeImageListener);
				}
				else if(nombre.equals("Dra. Miriam Campos Rebolledo"))
				{
					imgs.add(R.drawable.miriamcamposr_rebolledo_slide1);
					imgs.add(R.drawable.miriamcampos_slide2);
					header.setImageDrawable( getResources().getDrawable(R.drawable.header_neonatologo));
					hImageViewPic.setImageDrawable( getResources().getDrawable(R.drawable.miriamcamposr_rebolledo_slide1));
					iButton.setOnClickListener(iButtonChangeImageListener);
				    gButton.setOnClickListener(gButtonChangeImageListener);
				}
				else if(nombre.equals("Dr. Horacio Nolasco Martínez"))
				{
					header.setImageDrawable( getResources().getDrawable(R.drawable.header_neonatologo));
					hImageViewPic.setImageDrawable( getResources().getDrawable(R.drawable.nolascohoracio_slide1));
					 iButton.setVisibility(View.GONE);
					  gButton.setVisibility(View.GONE);
				}
				else if(nombre.equals("Dr. Omar Ernesto  Rojas Pacheco"))
				{
					header.setImageDrawable( getResources().getDrawable(R.drawable.header_reumatologo));
					imgs.add(R.drawable.omarrojas_slide1);
					imgs.add(R.drawable.omarrojas_slide2);
					hImageViewPic.setImageDrawable( getResources().getDrawable(R.drawable.omarrojas_slide1));
					iButton.setOnClickListener(iButtonChangeImageListener);
				    gButton.setOnClickListener(gButtonChangeImageListener);
				}
				else if(nombre.equals("Dr. Francisco Navarrete Suárez"))
				{
					header.setImageDrawable( getResources().getDrawable(R.drawable.header_alergologo));
					imgs.add(R.drawable.franciscon_slide1);
					imgs.add(R.drawable.franciscon_slide2);
					imgs.add(R.drawable.franciscon_slide3);
					imgs.add(R.drawable.franciscon_slide4);
					hImageViewPic.setImageDrawable( getResources().getDrawable(R.drawable.franciscon_slide1));
					iButton.setOnClickListener(iButtonChangeImageListener);
				    gButton.setOnClickListener(gButtonChangeImageListener);
				}
				else if(nombre.equals("Dra. Aurora Meza Morales"))
				{
					header.setImageDrawable( getResources().getDrawable(R.drawable.header_alergologo));
					imgs.add(R.drawable.aurorameza_slide1);
					imgs.add(R.drawable.aurorameza_slide2);
					hImageViewPic.setImageDrawable( getResources().getDrawable(R.drawable.aurorameza_slide1));
					iButton.setOnClickListener(iButtonChangeImageListener);
				    gButton.setOnClickListener(gButtonChangeImageListener);
				}
				else if(nombre.equals("Dr. Mauricio Peña Párraga"))
				{
					header.setImageDrawable( getResources().getDrawable(R.drawable.header_peidatra));
					hImageViewPic.setImageDrawable( getResources().getDrawable(R.drawable.mauricopena_slide1));
					 iButton.setVisibility(View.GONE);
					  gButton.setVisibility(View.GONE);
				}
				else if(nombre.equals("Dr. Raúl Barragán Parrao"))
				{
					imgs.add(R.drawable.barraganparrao_slide1);
					imgs.add(R.drawable.barragan_slide2);
					header.setImageDrawable( getResources().getDrawable(R.drawable.header_gastroenterologo));
					hImageViewPic.setImageDrawable( getResources().getDrawable(R.drawable.barraganparrao_slide1));
					iButton.setOnClickListener(iButtonChangeImageListener);
				    gButton.setOnClickListener(gButtonChangeImageListener);
				}
				else if(nombre.equals("Dra. Mónica Callejo"))
				{
					header.setImageDrawable( getResources().getDrawable(R.drawable.header_odontologo));
					hImageViewPic.setImageDrawable( getResources().getDrawable(R.drawable.logo_monica_callejo_big));
					 iButton.setVisibility(View.GONE);
					  gButton.setVisibility(View.GONE);
				}
				else{
					
				}
				
			  
			  
		  }
		
		 
		   
		   
	        
	        // Just set one Click listener for the image

	       
		
		
	
		
		
		
			
	}
	
	 View.OnClickListener iButtonChangeImageListener = new OnClickListener() {

         public void onClick(View v) {
             try {
                 // Increase Counter to move to next Image
                 currentImage++;

                 currentImage = currentImage % imgs.size();

                 hImageViewPic.setImageResource(imgs.get(currentImage));

               
             } catch (Exception e) {

             }

         }

     };

     View.OnClickListener gButtonChangeImageListener = new OnClickListener() {

         public void onClick(View v) {
             try {
                 // Decrease Counter to move to previous Image
                 currentImage--;

                 currentImage = (currentImage + imgs.size()) % imgs.size();

                 hImageViewPic.setImageResource(imgs.get(currentImage));

                 

             } catch (Exception e) {

             }
         }
     };

     protected void onPause() {
         // TODO Auto-generated method stub
         super.onPause();
         
         //finish();
     }
	
     @Override
	 public boolean onKeyUp(int keyCode, KeyEvent msg) {

	      switch(keyCode) {
	      case(KeyEvent.KEYCODE_BACK):
	          
			     if(code.equals("alergologo") || code.equals("gastro") || code.equals("odontologo")){
			    	 Intent a1_intent = new Intent(this, ListaMedicosActivity.class);
				     a1_intent.putExtra("especialidad", code);
			       startActivity(a1_intent);
			           finish();
			           return true;
			    	
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